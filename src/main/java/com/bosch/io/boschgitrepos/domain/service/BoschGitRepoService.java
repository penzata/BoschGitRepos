package com.bosch.io.boschgitrepos.domain.service;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;

import java.util.List;

public interface BoschGitRepoService {

    List<BoschGitRepo> saveBoshGitRepos(List<BoschGitRepo> boschGitRepos);

    List<BoschGitRepo> getPublicBoshGitRepos();
}
