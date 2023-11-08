--liquibase formatted sql

--changeset AZhukov:init
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS quotes
(
    id         UUID    NOT NULL
        CONSTRAINT quotes_pkey PRIMARY KEY,
    text       VARCHAR NOT NULL,
    author     VARCHAR,
    book_name  VARCHAR,
    created_at TIMESTAMP WITHOUT TIME ZONE,
    updated_at TIMESTAMP WITHOUT TIME ZONE
);

