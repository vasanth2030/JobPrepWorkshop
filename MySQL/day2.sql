desc student;

INSERT INTO student Values(1,'Vasanth',21,'vasanth@gmail.com','12345');

select * from student;

INSERT INTO student (id,student_name,email) values(2,'Vijay','vijay@yahoo.com');

insert into student (student_name,id,age) values ('Vishwa',3,23);

insert into student values 
(4,'Vimal',22,DEFAULT,'984090'),
(5,'Sunil',22,'sunil@gmail.com','123890');

update student set age=25 where id=2;

update student set email='vishwa@google.com',phone_no='987067' where id=3;

update student set phone_no=NULL where id=3 or id=2;

delete from student where id=5;