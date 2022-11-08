package com.bosch.io.boschgitrepos.rest.dto;

import com.bosch.io.boschgitrepos.domain.model.BoschGitRepo;

public record RepoFilterDTO(String name,
                            String desc,
                            String lang) {

    public BoschGitRepo toExample() {
        BoschGitRepo boschGitRepo = new BoschGitRepo();
        boschGitRepo.setFullName(name);
        boschGitRepo.setDescription(desc);
        boschGitRepo.setProgrammingLanguage(lang);

        return boschGitRepo;
    }
}