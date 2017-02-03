drop table if exists widgets_collection;

create table widgets_collection ( i_widget_id integer identity primary key, s_module varchar (100),  s_widget_id varchar (100) , s_widget_description varchar (200) ,i_status varchar (10) );


insert into widgets_collection (s_module ,s_widget_id , s_widget_description ,i_status) values ('login','Login_username' , 'username','1')
insert into widgets_collection (s_module ,s_widget_id , s_widget_description ,i_status) values ('login','Login_password' , 'password','1')
insert into widgets_collection (s_module ,s_widget_id , s_widget_description ,i_status) values ('login','Login_submit' , 'submit login','1')

