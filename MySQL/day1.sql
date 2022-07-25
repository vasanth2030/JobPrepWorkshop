cReAte database mysqlworkshop;

USE mysqlworkshop;

create table student(id int, student_name text, age int, email varchar(20));

show tables;

DESC student;

alter table student modify column id int primary key;

alter table student add column phone_no varchar(50) default 'Not provided';

CREATE table student1 as select * from student;

Create table student2 as select * from student;