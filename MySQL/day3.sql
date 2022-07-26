SELECT * FROM student;

SELECT student_name, age FROM student;

select * from student where student_name='Vijay' AND age>22;

select * from student where student_name='Vasanth' OR age>22;

select * from student where NOT age>22;

select * from student where student_name like '_i%';

select * from student where id=1 or id=3 or id=4;

select * from student where id in (1,3,4);

select * from student where age>=21 and age<=23;

select * from student where age between 21 and 23;

select * from student order by student_name;

update student set age=22 where id=1 or id=3;

select * from student order by age desc, student_name desc;

select * from student limit 2;

select count(distinct age) from student;

select sum(age) from student;

select avg(age) from student;

select max(age) from student;

select min(age) from student;

select age, count(id) as 'count' from student group by age; 


