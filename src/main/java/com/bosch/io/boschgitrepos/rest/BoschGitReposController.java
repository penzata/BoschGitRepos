package com.bosch.io.boschgitrepos.rest;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;
import com.bosch.io.boschgitrepos.domain.service.BoschGitRepoService;
import com.bosch.io.boschgitrepos.rest.dto.BoschGitRepoDTO;
import com.bosch.io.boschgitrepos.rest.dto.RepoFilterDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bosch-repos")
public class BoschGitReposController {

    private final BoschGitRepoService boschGitRepoService;

    public BoschGitReposController(BoschGitRepoService boschGitRepoService) {
        this.boschGitRepoService = boschGitRepoService;
    }

    @GetMapping()
    public List<BoschGitRepoDTO> getBoschGitRepos(RepoFilterDTO repoFilterDTO) {
        List<BoschGitRepo> boschGitRepos;
        if (repoFilterDTO == null) {
            boschGitRepos = boschGitRepoService.getPublicBoshGitRepos();
        } else {
            boschGitRepos = boschGitRepoService.getPublicBoshGitRepos(repoFilterDTO.toExample());
        }

        return boschGitRepos.stream()
                .map(BoschGitRepoDTO::fromModel)
                .toList();
    }

}
