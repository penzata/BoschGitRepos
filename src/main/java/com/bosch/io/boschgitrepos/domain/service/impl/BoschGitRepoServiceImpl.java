package com.bosch.io.boschgitrepos.domain.service.impl;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;
import com.bosch.io.boschgitrepos.domain.service.BoschGitRepoService;
import com.bosch.io.boschgitrepos.persistence.repository.BoschGitRepoRepository;

import java.util.List;

public class BoschGitRepoServiceImpl implements BoschGitRepoService {

    private final BoschGitRepoRepository boschGitRepoRepository;

    public BoschGitRepoServiceImpl(BoschGitRepoRepository boschGitRepoRepository) {
        this.boschGitRepoRepository = boschGitRepoRepository;
    }

    @Override
    public List<BoschGitRepo> saveBoshGitRepos(List<BoschGitRepo> boschGitRepos) {
        return boschGitRepoRepository.saveAll(boschGitRepos);
    }

    @Override
    public List<BoschGitRepo> findBoshGitRepos() {
        return boschGitRepoRepository.findAll();
    }
}
