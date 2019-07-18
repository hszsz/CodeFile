create user 'student'@'localhost' identified by 'student';
create database student charset utf8;
grant all on student.* to 'student'@'localhost';

-- 修改加密规则
ALTER USER 'student'@'localhost' IDENTIFIED BY 'student' PASSWORD EXPIRE NEVER; 
-- 更新用户密码 
ALTER USER 'student'@'localhost' IDENTIFIED WITH mysql_native_password BY 'student';
-- 刷新权限（不输入也可以）
FLUSH PRIVILEGES;

drop database student;
DROP USER 'student'@'localhost';
use sys;

select user,host from mysql.user; 

SHOW DATABASES;


create table student (
    id int not null auto_increment primary key,        
    studentId char(8),                                  
    className varchar(20),                              
    name varchar(20),                                  
    address varchar(200),                               
    mobile char(11),                                    
    birthday date                                       
);

SELECT * from student;


create unique index student_index1 on student(studentId);      #唯一索引，约束学号唯一

insert into student(studentId, className, name, address, mobile, birthday) values('12340001', '大数据17-1', '张三', '四川广元', '13900018888', '1999-01-01');

#课程信息表
create table course (
    id int not null auto_increment primary key,         
    name varchar(30) not null,                          
    courseScore decimal(2, 1) not null,                 
    courseTime int not null,                            
    courseType varchar(20)                              
);
create unique index course_index1 on course(name);      #唯一索引，约束课程名称唯一

#学生成绩表
create table studentScore(
    id int not null auto_increment primary key,          
    studentId char(8) references student(studentId),    
    courseId int references course(id),                 
    dt date not null,                                   
    score decimal(3, 1)                                 
);

#学生成绩表
create table studentScore(
    id int not null auto_increment primary key,          
    studentId char(8),                                  
    courseId int,                                       
    dt date not null,                                   
    score decimal(3, 1),                                
    foreign key(studentId) references student(studentId),
    foreign key(courseId) references course(id)
);


insert into studentScore(studentId, courseId, dt, score) values("12345678", 1, '2019-01-01', 99.5);
SELECT * from studentScore;


drop table studet;
drop table studentScore;
drop table course;