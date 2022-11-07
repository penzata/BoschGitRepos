package com.bosch.io.boschgitrepos.domain.client.dto;

public record RepositoryDTO (String id,
                             String fullName,
                             String description,
                             String programmingLanguage,
                             String htmlUrl){
}