CREATE TABLE business_user
(
    id                  BIGINT NOT NULL AUTO_INCREMENT,
    business_user_id    BINARY (16) NOT NULL,
    first_name          VARCHAR (255),
    last_name           VARCHAR (255),
    email               VARCHAR (255),
    address             VARCHAR (255),
    CONSTRAINT pk_user PRIMARY KEY (id)
);

CREATE TABLE role
(
    id                  BIGINT NOT NULL AUTO_INCREMENT,
    name                VARCHAR (100),
    description         VARCHAR (255),
    code                VARCHAR (100),
    CONSTRAINT pk_role PRIMARY KEY (id)
);

INSERT INTO role (name, description, code) VALUES ('Manager', 'Manager role', 'MGR');
INSERT INTO role (name, description, code) VALUES ('Super-Admin', 'Super Admin role', 'S-ADM');
INSERT INTO role (name, description, code) VALUES ('Admin', 'Admin role', 'ADM');
INSERT INTO role (name, description, code) VALUES ('User', 'User role', 'USR');

CREATE TABLE business_user_role
(
    id                  BIGINT NOT NULL AUTO_INCREMENT,
    business_user_id    BIGINT NOT NULL,
    role_id             BIGINT NOT NULL,
    created_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_business_user_role PRIMARY KEY (id),
    CONSTRAINT fk_business_user_role_user FOREIGN KEY (business_user_id) REFERENCES business_user (id),
    CONSTRAINT fk_business_user_role_role FOREIGN KEY (role_id) REFERENCES role (id)
);