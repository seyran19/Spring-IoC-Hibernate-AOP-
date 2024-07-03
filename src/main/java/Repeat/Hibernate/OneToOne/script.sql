-- drop table employees;
-- drop table details;

-- Создание таблицы details
CREATE TABLE details (
                         id BIGSERIAL  PRIMARY KEY NOT NULL ,
                         city VARCHAR(15),
                         phone_number VARCHAR(25),
                         email VARCHAR(30)
);

-- Создание таблицы employees
CREATE TABLE employees (
                           id BIGSERIAL PRIMARY KEY NOT NULL ,
                           name VARCHAR(15),
                           surname VARCHAR(25),
                           department VARCHAR(20),
                           salary INT,
                           details_id INT,
                           CONSTRAINT fk_details FOREIGN KEY (details_id) REFERENCES details(id)
);
