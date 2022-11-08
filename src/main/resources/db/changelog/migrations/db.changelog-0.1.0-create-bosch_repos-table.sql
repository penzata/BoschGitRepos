CREATE TABLE bosch_repos
(
    id SERIAL PRIMARY KEY NOT NULL,
    full_name VARCHAR(256) NOT NULL,
    description CHARACTER LARGE OBJECT,
    programming_language VARCHAR(50),
    html_url VARCHAR(256) NOT NULL
)