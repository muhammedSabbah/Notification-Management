CREATE TABLE business_user
(
    id          serial NOT NULL AUTO_INCREMENT,
    first_name  VARCHAR (255),
    last_name   VARCHAR (255),
    email       VARCHAR (255),
    address     VARCHAR (255),
    CONSTRAINT pk_user PRIMARY KEY (id)
);