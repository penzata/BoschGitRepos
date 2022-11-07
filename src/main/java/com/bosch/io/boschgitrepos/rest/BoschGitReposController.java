package com.bosch.io.boschgitrepos.rest;

import com.bosch.io.boschgitrepos.domain.service.BoschGitRepoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bosch_repos")
public class BoschGitReposController {

    private final BoschGitRepoService boschGitRepoService;

    public BoschGitReposController(BoschGitRepoService boschGitRepoService) {
        this.boschGitRepoService = boschGitRepoService;
    }
}
