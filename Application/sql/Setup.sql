drop table if exists setup_table;

create table setup_table ( i_setup_id integer identity primary key, s_module varchar (100),  s_widget_id varchar (100) , s_widget_name varchar (200) , s_data varchar (100), s_action_type varchar (100) ,s_sequence  varchar (100) ,s_reference  varchar (100) ,i_status varchar (10) );

drop table if exists group_table;

create table group_table ( i_id integer identity primary key, s_name varchar (200) UNIQUE ,i_status varchar (10) );

insert into setup_table (s_module ,s_widget_id ,s_widget_name ,s_data ,s_action_type , s_sequence, s_reference ,i_status) values ('login', 'username','username','papisit' ,'TextBox','1', 'username_meen','1');
insert into setup_table (s_module ,s_widget_id ,s_widget_name ,s_data ,s_action_type , s_sequence, s_reference ,i_status) values ('login', 'password','password','Isnsit_12' ,'TextBox','2', 'username_meen','1');
insert into setup_table (s_module ,s_widget_id ,s_widget_name ,s_data ,s_action_type , s_sequence, s_reference ,i_status) values ('login', 'submit' ,'submit','' , 'Button' ,'3','username_meen','1');

insert into group_table (s_name   ,i_status) values ('username_meen',1);

select i_setup_id as setupId , s_module as module , s_widget_id as widgetId , s_widget_name as widgetName , s_data as data , s_action_type as actionType , s_sequence as sequence ,s_reference as reference from setup_table where s_module = 'login'and s_reference = 'username_meen' ;

select i_id as id , s_name as name , i_status as status from group_table ;

