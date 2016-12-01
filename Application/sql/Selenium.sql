drop table if exists gen_prepare_test_data;

create table gen_prepare_test_data ( i_prepare_test_id integer identity primary key, c_widget_id varchar (100), c_widget_data varchar (100) ,c_widget_type varchar (100), c_test_case_name varchar (100) ,c_sequence varchar (100) ,c_action_type varchar(100));


drop table if exists gen_description_test_case;

create table gen_description_test_case ( i_description_test_id integer identity primary key, c_test_case_name varchar (100), c_description varchar (255)  );



insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('userName','meen','textbox','case_0000001','1','input');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('password','meen','textbox','case_0000001','2','input');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('loginButton','','button','case_0000001','3','click');


insert into gen_description_test_case (c_test_case_name ,c_description) values ('case_0000001','Login Test Case');


----

insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('Login_username','papisit','textbox','login','1','input');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('Login_password','Isnsit_12','textbox','login','2','input');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('Login_submit','','button','login','3','click');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('Select_Office_selectOfficeListBox','Shipco Transport USA (NYC)','listbox','login','4','select');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('Menu_menuPanel','','button','login','5','click');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('Menu_menu_0','','button','login','6','click');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name ,c_sequence, c_action_type) values ('Menu_menu_List_2','','button','login','7','click');





insert into gen_description_test_case (c_test_case_name ,c_description) values ('login','Login Test Case');




