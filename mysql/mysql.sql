-- 查询数据库
show databases;
-- 创建数据库  
create database pano charset utf8;
--创建用户 
create user 'pano'@'localhost' identified by 'pano';
-- 授予相应权限 
grant all on pano.* to 'pano'@'localhost';
-- 修改加密规则
ALTER USER 'pano'@'localhost' IDENTIFIED BY 'pano' PASSWORD EXPIRE NEVER; 
-- 更新用户密码 
ALTER USER 'pano'@'%' IDENTIFIED WITH mysql_native_password BY 'pano';
-- 刷新权限（不输入也可以）
FLUSH PRIVILEGES;

-- 删除表  
drop table classification;
drop table user;

-- 删除数据库
drop database pano;
-- 删除用户
drop user 'pano'@'localhost';

-- 创建数据库
create database vrpano charset utf8;
--创建用户
create user 'vrpano'@'localhost' identified by 'vrpano';
--授予权限
grant all on vrpano.* to 'vrpano'@'localhost';
-- 修改加密规则
ALTER USER 'vrpano'@'localhost' IDENTIFIED BY 'vrpano' PASSWORD EXPIRE NEVER; 
-- 更新用户密码 
ALTER USER 'vrpano'@'localhost' IDENTIFIED WITH mysql_native_password BY 'vrpano';
-- 刷新权限（不输入也可以）
FLUSH PRIVILEGES;



-- 创建表
create table user (
    id int not null auto_increment primary key,     
    name varchar(100),
    email VARCHAR (100),
    password varchar(100),
    password1 VARCHAR(100),                             
    sortOrder int                                   
);

--删除表
DROP table department;

--插入数据
INSERT into user(id,name,email,password,password1,sortOrder) value(1,"菜刀","123456@qq.com",'123456','123456',1);
INSERT into user(id,name,email,password,password1,sortOrder) value(2,"菜刀1","123456@qq.com",'123456','123456',2);
INSERT into user(id,name,email,password,password1,sortOrder) value(3,"菜刀2","123456@qq.com",'123456','123456',3);
INSERT into user(id,name,email,password,password1,sortOrder) value(4,"菜刀3","123456@qq.com",'123456','123456',4);
INSERT into user(id,name,email,password,password1,sortOrder) value(5,"菜刀4","123456@qq.com",'123456','123456',5);
INSERT into user(id,name,email,password,password1,sortOrder) value(6,"菜刀5","123456@qq.com",'123456','123456',6);
INSERT into user(id,name,email,password,password1,sortOrder) value(7,"菜刀6","123456@qq.com",'123456','123456',7);
INSERT into user(id,name,email,password,password1,sortOrder) value(8,"菜刀7","123456@qq.com",'123456','123456',8);
INSERT into user(id,name,email,password,password1,sortOrder) value(9,"菜刀8","123456@qq.com",'123456','123456',9);
INSERT into user(id,name,email,password,password1,sortOrder) value(10,"菜刀9","123456@qq.com",'123456','123456',10);

--查询表
SELECT * from user;

SELECT * from student;



-- student数据库
SELECT * from course;
insert into course( courseScore, courseTime, courseType,name) values("数据库",80.5, 20, '必修');
drop table course;

create table course (
    id int not null auto_increment primary key,         
    name varchar(30) not null,                          
    courseScore decimal(4, 1) not null,                 
    courseTime int not null,                            
    courseType varchar(20)                              
);
exit;