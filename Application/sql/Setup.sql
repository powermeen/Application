drop table if exists setup_table;

create table setup_table ( i_setup_id integer identity primary key, s_module varchar (100),  s_widget_id varchar (100) , s_name_widget varchar (200) , s_data varchar (100), s_action_type varchar (100) ,s_reference  varchar (100) ,i_status integer );

drop table if exists group_table;

create table group_table ( i_id integer identity primary key, s_name varchar (200) UNIQUE ,i_status integer );

insert into setup_table (s_module ,s_widget_id ,s_name_widget ,s_data ,s_action_type , s_reference ,i_status) values ('login', 'username','username','papisit' ,'textbox', 'username_meen',1);
insert into setup_table (s_module ,s_widget_id ,s_name_widget ,s_data ,s_action_type , s_reference ,i_status) values ('login', 'password','password','Isnsit_12' ,'textbox', 'username_meen',1);
insert into setup_table (s_module ,s_widget_id ,s_name_widget ,s_data ,s_action_type , s_reference ,i_status) values ('login', 'submit' ,'submit','' , 'button' ,'username_meen',1);

insert into group_table (s_name   ,i_status) values ('username_meen',1);

