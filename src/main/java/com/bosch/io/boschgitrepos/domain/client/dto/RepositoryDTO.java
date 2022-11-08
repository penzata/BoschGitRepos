package com.bosch.io.boschgitrepos.domain.client.dto;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;
import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryDTO(Integer id,
                            @JsonProperty("full_name")
                            String fullName,
                            String description,
                            String language,
                            @JsonProperty("html_url")
                            String htmlUrl) {

    public BoschGitRepo toModel() {
        return new BoschGitRepo(id, fullName, description, language, htmlUrl);
    }
}