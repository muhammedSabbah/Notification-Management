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
    business_user_id    BIGINT,
    CONSTRAINT pk_role PRIMARY KEY (id),
    CONSTRAINT fk_role_business_user FOREIGN KEY (business_user_id) REFERENCES business_user (id)
);