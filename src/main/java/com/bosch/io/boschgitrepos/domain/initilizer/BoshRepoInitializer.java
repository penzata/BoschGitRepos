package com.bosch.io.boschgitrepos.domain.initilizer;

import com.bosch.io.boschgitrepos.domain.client.GitHubClient;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BoshRepoInitializer implements InitializingBean {

    private final GitHubClient gitHubClient;

    public BoshRepoInitializer(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //todo extract this into constant
        //todo add while loop to get all pages
        gitHubClient.getPublicRepos("bosch-io", 1, 30)
                        .forEach(repo -> System.out.println(repo.id()));

    }
}
