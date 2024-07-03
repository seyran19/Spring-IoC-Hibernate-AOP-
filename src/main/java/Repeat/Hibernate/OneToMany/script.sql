-- Создание таблицы departments
CREATE TABLE departments (
                             id SERIAL PRIMARY KEY,
                             name VARCHAR(15),
                             max_salary INT,
                             min_salary INT
);

-- Создание таблицы employees
CREATE TABLE employees (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(15),
                           surname VARCHAR(25),
                           salary INT,
                           department_id INT,
                           FOREIGN KEY (department_id) REFERENCES departments(id)
);






