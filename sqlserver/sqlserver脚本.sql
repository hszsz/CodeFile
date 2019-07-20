select * from sys.tables;

create login student with password='student', default_database=student;
create user student for login student with default_schema=student;
exec sp_addrolemember 'db_owner', 'student';


USE student;

CREATE TABLE DEPT
       (DEPTNO int primary key,
        DNAME VARCHAR(14),
        LOC VARCHAR(13) );

INSERT INTO DEPT VALUES (101, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (201, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (301, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (401, 'OPERATIONS', 'BOSTON');

SELECT * FROM DEPT;

USE master;

DROP user student;
DROP database student;
DROP table DEPT;

CREATE DATABASE student;

create database student
on primary(
name="student",
filename="D:\code\database\student\student",
size=10MB,
maxsize=30MB,
filegrowth=1MB
)
log on(
name="student_log",
filename="D:\code\database\student\student_log",
size=10MB
)