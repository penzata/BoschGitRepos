package com.bosch.io.boschgitrepos.domain.service.impl;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;
import com.bosch.io.boschgitrepos.domain.service.BoschGitRepoService;
import com.bosch.io.boschgitrepos.persistence.repository.BoschGitRepoRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.bosch.io.boschgitrepos.domain.model.BoschGitRepo.*;

@Service
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
    public List<BoschGitRepo> getPublicBoshGitRepos() {
        return boschGitRepoRepository.findAll();
    }

    @Override
    public List<BoschGitRepo> getPublicBoshGitRepos(BoschGitRepo repoQueryExample) {

        ExampleMatcher customExampleMatcher = ExampleMatcher.matching()
                .withMatcher(FULL_NAME, ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
                .withMatcher(DESC, ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
                .withMatcher(LANGUAGE, ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());

        Example<BoschGitRepo> example = Example.of(repoQueryExample, customExampleMatcher);

        return boschGitRepoRepository.findAll(example);
    }
}
