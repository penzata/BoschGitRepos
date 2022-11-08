package com.bosch.io.boschgitrepos.domain.initilizer;

import com.bosch.io.boschgitrepos.domain.client.GitHubClient;
import com.bosch.io.boschgitrepos.domain.client.dto.RepositoryDTO;
import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;
import com.bosch.io.boschgitrepos.domain.service.BoschGitRepoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BoshRepoInitializer implements InitializingBean {

    private final GitHubClient gitHubClient;
    private final BoschGitRepoService boschGitRepoService;

    public BoshRepoInitializer(GitHubClient gitHubClient, BoschGitRepoService boschGitRepoService) {
        this.gitHubClient = gitHubClient;
        this.boschGitRepoService = boschGitRepoService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        int pageSize = 1;
        int page = 1;

        while (pageSize > 0) {
            List<BoschGitRepo> allRepos = gitHubClient.getAllPublicRepos(page).stream()
                    .map(RepositoryDTO::toModel)
                    .toList();

            pageSize = allRepos.size();

            if (pageSize > 0) {
                boschGitRepoService.saveBoshGitRepos(allRepos);
            }
            page++;
        }
    }
}
