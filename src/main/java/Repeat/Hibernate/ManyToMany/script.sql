CREATE TABLE children (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(15),
                          age INT
);

CREATE TABLE section (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(15)
);

CREATE TABLE child_section (
                               child_id INT NOT NULL,
                               section_id INT NOT NULL,
                               PRIMARY KEY (child_id, section_id),
                               FOREIGN KEY (child_id) REFERENCES children(id),
                               FOREIGN KEY (section_id) REFERENCES section(id)
);
