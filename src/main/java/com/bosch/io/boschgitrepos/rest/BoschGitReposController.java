package com.bosch.io.boschgitrepos.rest;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;
import com.bosch.io.boschgitrepos.domain.service.BoschGitRepoService;
import com.bosch.io.boschgitrepos.rest.dto.BoschGitRepoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bosch_repos")
public class BoschGitReposController {

    private final BoschGitRepoService boschGitRepoService;

    public BoschGitReposController(BoschGitRepoService boschGitRepoService) {
        this.boschGitRepoService = boschGitRepoService;
    }

    @GetMapping()
    public List<BoschGitRepoDTO> getBoschGitRepos() {
        List<BoschGitRepo> boschGitRepos = boschGitRepoService.getPublicBoshGitRepos();

        return boschGitRepos.stream()
                .map(BoschGitRepoDTO::fromModel)
                .collect(Collectors.toList());
    }

}
