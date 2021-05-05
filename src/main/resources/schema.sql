drop table if exists marvel CASCADE;
CREATE TABLE marvel (
    id BIGINT AUTO_INCREMENT,
    dead BOOLEAN NOT NULL,
    name VARCHAR(255),
    species VARCHAR(255),
    super_soldier BOOLEAN NOT NULL,
    PRIMARY KEY (id)
);