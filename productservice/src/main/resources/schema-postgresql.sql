-- CREATE SCHEMA IF NOT EXISTS product;
-- CREATE DATABASE productservice
--     WITH
--     OWNER = postgres
--     ENCODING = 'UTF8'
--     CONNECTION LIMIT = -1;


CREATE SCHEMA IF NOT EXISTS product
    AUTHORIZATION postgres;

GRANT ALL ON SCHEMA product TO PUBLIC;

GRANT ALL ON SCHEMA product TO postgres;
