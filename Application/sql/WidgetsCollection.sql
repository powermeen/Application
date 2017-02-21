drop table if exists widgetc_collection;

create table widgetc_collection ( i_collection_id integer identity primary key, c_module varchar (100),  c_widget_id varchar (100) , c_description varchar (200) ,i_status varchar (10) );


insert into widgetc_collection (c_module ,c_widget_id , c_widget_description ,i_status) values ('Login','Login_username' , 'username','1');
insert into widgetc_collection (c_module ,c_widget_id , c_widget_description ,i_status) values ('Login','Login_password' , 'password','1');
insert into widgetc_collection (c_module ,c_widget_id , c_widget_description ,i_status) values ('Login','Login_submit' , 'submit login','1');


select * from widgetc_collection where c_module = 'login' and i_status  > 1  ;

