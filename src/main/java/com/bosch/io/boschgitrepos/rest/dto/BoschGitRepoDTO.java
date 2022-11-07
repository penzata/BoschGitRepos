package com.bosch.io.boschgitrepos.rest.dto;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;

public record BoschGitRepoDTO(String id,
                              String fullName,
                              String description,
                              String programmingLanguage,
                              String htmlUrl) {

    public BoschGitRepo toModel() {
        return new BoschGitRepo(id, fullName, description, programmingLanguage, htmlUrl);
    }

    public static BoschGitRepoDTO fromModel(BoschGitRepo boschGitRepo) {
        return new BoschGitRepoDTO(boschGitRepo.getId(),
                boschGitRepo.getFullName(),
                boschGitRepo.getDescription(),
                boschGitRepo.getProgrammingLanguage(),
                boschGitRepo.getHtmlUrl());
    }

}