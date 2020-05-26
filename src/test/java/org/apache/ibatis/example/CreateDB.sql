

drop table users if exists;

create table users (
  id int,
  user_name varchar(20) ,
  pwd varchar(20),
  age int
);

insert into users (id, user_name,pwd,age) values(1, 'UserName','123',100);

