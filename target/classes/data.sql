DROP TABLE IF EXISTS billionaires;

CREATE TABLE billionaires (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              first_name VARCHAR(250) NOT NULL,
                              last_name VARCHAR(250) NOT NULL,
                              career VARCHAR(250) DEFAULT NULL
);

INSERT INTO billionaires (first_name, last_name, career) VALUES
('Aliko', 'Dangote', 'Billionaire Industrialist'),
('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

DROP  table  if exists document;

create table GreetingEntity (
    id int auto_increment primary key,
    name varchar(20),
    value varchar(20),
    file blob
);
