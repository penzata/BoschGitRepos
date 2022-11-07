package com.bosch.io.boschgitrepos.domain.client.dto;

public record RepositoryDTO (Integer id,
                             String fullName,
                             String description,
                             String programmingLanguage,
                             String htmlUrl){
}