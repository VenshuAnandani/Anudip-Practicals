CREATE DATABASE PROJECT_BASIC_JDBC;
USE PROJECT_BASIC_JDBC;

CREATE TABLE students(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
age INT,
email VARCHAR(100),
department VARCHAR(50),
city VARCHAR(30)
);

SELECT * FROM students;