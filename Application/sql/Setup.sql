drop table if exists setup_table;

create table setup_table ( i_setup_id integer identity primary key, c_module varchar (100),  c_widget_id varchar (100) , c_widget_name varchar (200) , c_data varchar (100), c_action_type varchar (100) ,c_sequence  varchar (100) ,c_reference  varchar (100) ,i_status varchar (10) );


insert into setup_table (c_module ,c_widget_id ,c_widget_name ,c_data ,c_action_type , c_sequence, c_reference ,i_status) values ('login', 'Login_username','username','papisit' ,'TextBox','1', 'Login_Meen','1');
insert into setup_table (c_module ,c_widget_id ,c_widget_name ,c_data ,c_action_type , c_sequence, c_reference ,i_status) values ('login', 'Login_password','password','Isnsit_12' ,'TextBox','2', 'Login_Meen','1');
insert into setup_table (c_module ,c_widget_id ,c_widget_name ,c_data ,c_action_type , c_sequence, c_reference ,i_status) values ('login', 'Login_submit' ,'submit','' , 'Button' ,'3','Login_Meen','1');


select i_setup_id as Id , c_module as module , c_widget_id as widgetId , c_widget_name as widgetName , c_data as data , c_action_type as actionType , c_sequence as sequence ,c_reference as reference from setup_table where c_module = 'login'and c_reference = 'username_meen' ;

