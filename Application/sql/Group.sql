drop table if exists group_table;

create table group_table ( i_group_id integer identity primary key, s_name varchar (200) UNIQUE ,i_status varchar (10) );

insert into group_table (s_name   ,i_status) values ('username_meen',1);

select i_group_id as Id , s_name as name ,i_status as status from group_table 
