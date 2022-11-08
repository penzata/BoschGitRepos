package com.bosch.io.boschgitrepos.rest.dto;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;

public record RepoFilterDTO(String name,
                            String description,
                            String language) {

    public BoschGitRepo toExample() {
        BoschGitRepo boschGitRepo = new BoschGitRepo();
        boschGitRepo.setFullName(name);
        boschGitRepo.setDescription(description);
        boschGitRepo.setProgrammingLanguage(language);

        return boschGitRepo;
    }
}