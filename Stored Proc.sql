create table details(eid varchar(20),ename varchar(20));


insert into details values ('e001','Pallavi');

create proc disp
as 
select * from details;

drop proc disp;

exec disp

create proc addData (@empid varchar(20) ,@empname varchar(20))
as
insert into Details values(@empid,@empname);

exec addData 'e003','Zain';
