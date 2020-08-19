create table person(pid number primary key,name varchar(10), city varchar(10), state varchar(10),bdate date, adhar number(12),pan varchar(10));
insert into person values(12,'sai','pune','MH','12-May-99',123412341234,'1223ddf3');
 
insert into person values(13,'saipriya','pune','MH','13-May-99',123412341234,'1223ddf3');
insert into person values(33,'sam','hyd','MH','12-Aug-99',123412341234,'1223ddf3');
insert into person values(44,'ajay','hyd','MH','12-sep-99',123412341234,'1223ddf3');
insert into person values(444,'priya','pune','MH','12-May-97',123412341234,'1223ddf3');
insert into person values(77,'anu','hyd','MH','5-May-96',123412341234,'1223ddf3');
insert into person values(65,'shreya','hyd','MH','23-nov-99',123412341234,'1223ddf3');
insert into person values(36,'samir','hyd','MH','2-jun-98',123412341234,'1223ddf3');
select * from person;

update person set name='sachin', city='hyd' where pid='13';
select * from person;

update person set state='TEl' where city='hyd';
select * from person;

delete from person where pid=77;
select * from person;

delete from person where city='hyd';
select * from person;
