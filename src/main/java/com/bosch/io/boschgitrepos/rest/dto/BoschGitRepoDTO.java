package com.bosch.io.boschgitrepos.rest.dto;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;

public record BoschGitRepoDTO(Integer id,
                              String fullName,
                              String description,
                              String programmingLanguage,
                              String htmlUrl) {

    public static BoschGitRepoDTO fromModel(BoschGitRepo boschGitRepo) {
        return new BoschGitRepoDTO(boschGitRepo.getId(),
                boschGitRepo.getFullName(),
                boschGitRepo.getDescription(),
                boschGitRepo.getProgrammingLanguage(),
                boschGitRepo.getHtmlUrl());
    }

}