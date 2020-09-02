DROP TABLE IF EXISTS user_record;

create table user_record (ID INT AUTO_INCREMENT, name varchar(50), email varchar(100));

insert into user_record (name, email) values('First User','firstemail@test.com');