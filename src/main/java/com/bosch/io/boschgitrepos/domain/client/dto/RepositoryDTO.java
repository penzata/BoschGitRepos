package com.bosch.io.boschgitrepos.domain.client.dto;

public record RepositoryDTO (Integer id,
                             String full_name,
                             String description,
                             String language,
                             String html_url){
}