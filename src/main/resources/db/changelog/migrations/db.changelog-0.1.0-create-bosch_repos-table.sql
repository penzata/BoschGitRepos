CREATE TABLE bosch_repos
(
    id SERIAL PRIMARY KEY NOT NULL,
    fullName VARCHAR(50) NOT NULL,
    description VARCHAR(256) NOT NULL,
    programmingLanguage VARCHAR(50) NOT NULL,
    htmlUrl VARCHAR(256) NOT NULL
)d