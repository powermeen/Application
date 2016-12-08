drop table if exists setup_table;

create table setup_table ( i_setup_id integer identity primary key, s_module varchar (100), s_widget varchar (100) ,s_data varchar (100),s_reference  varchar (100) UNIQUE,i_status integer );

drop table if exists group_table;

create table group_table ( i_id integer identity primary key, s_name varchar (200) UNIQUE ,i_status integer );

insert into setup_table (s_module ,s_widget ,s_data ,s_reference ,i_status) values ('login','username','papisit' , 'username_meen',1);
insert into setup_table (s_module ,s_widget ,s_data ,s_reference ,i_status) values ('login','password','papisit' , 'username_meen',1);

insert into group_table (s_name   ,i_status) values ('username_meen',1);

