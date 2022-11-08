package com.bosch.io.boschgitrepos.domain.model;

import javax.persistence.*;

@Entity
@Table(name="bosch_repos")
public class BoschGitRepo {

    public static final String FULL_NAME = "fullName";
    public static final String DESCRIPTION = "description";
    public static final String LANGUAGE = "programmingLanguage";

    @Id
    @Column(columnDefinition = "SERIAL")
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "description")
    private String description;

    @Column(name = "programming_language")
    private String programmingLanguage;

    @Column(name = "html_url")
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }
}


