drop table if exists group_table;

create table group_table ( i_group_id integer identity primary key, c_name varchar (200) UNIQUE , c_module varchar (200),i_status varchar (10) );

insert into group_table (c_name  , c_module ,i_status  ) values ('Login_Meen','Login',1);

select i_group_id as Id , c_name as name ,i_status as status from group_table 

update group_table set c_name = '12121' where i_group_id = '0'
