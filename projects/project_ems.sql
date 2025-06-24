CREATE DATABASE PROJECT_EMS;
USE PROJECT_EMS;

CREATE TABLE Dept_Info(
Dept_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Name VARCHAR(100)
);

CREATE TABLE Employee_Info(
Emp_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Name VARCHAR(100),
Email VARCHAR(100),
Designation VARCHAR(50),
Dept_ID INT,
FOREIGN KEY (Dept_ID) REFERENCES Dept_Info(Dept_ID)
);

INSERT INTO Dept_Info(Name) VALUES ('Software Engineering'), ('Quality Assurance'), ('Database Administration'), ('Cybersecurity'), ('Project Management'), ('Finance & Accounting'), ('HR'), ('Research & Development');

SELECT *FROM Dept_Info;