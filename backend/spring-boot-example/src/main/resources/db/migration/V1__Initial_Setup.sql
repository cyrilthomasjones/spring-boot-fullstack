-- drop table customer;

DROP TABLE IF EXISTS customer;


-- Create sequence customer_id_sequence;

CREATE TABLE customer
(
--     id    BIGINT DEFAULT nextval('customer_id_sequence') PRIMARY KEY,
    id BIGSERIAL PRIMARY KEY,
    name  TEXT NOT NULL,
    email TEXT NOT NULL,
    age   INT  NOT NULL
);