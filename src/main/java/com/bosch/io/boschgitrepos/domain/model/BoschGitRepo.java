package com.bosch.io.boschgitrepos.domain.model;

import javax.persistence.*;

@Entity
@Table(name="bosch_repos")
public class BoschGitRepo {
    @Id
    @Column(columnDefinition = "SERIAL")
    private Integer id;
    private String fullName;
    private String description;
    private String programmingLanguage;
    private String htmlUrl;

    public BoschGitRepo() {
    }

    public BoschGitRepo(Integer id, String fullName, String description, String programmingLanguage, String htmlUrl) {
        this.id = id;
        this.fullName = fullName;
        this.description = description;
        this.programmingLanguage = programmingLanguage;
        this.htmlUrl = htmlUrl;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDescription() {
        return description;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}


