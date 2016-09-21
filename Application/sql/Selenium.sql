drop table if exists gen_prepare_test_data;

create table gen_prepare_test_data ( i_prepare_test_id integer identity primary key, c_widget_id varchar (100), c_widget_data varchar (100) ,c_widget_type varchar (100), c_test_case_name varchar (100) c_sequence varchar (100));


drop table if exists gen_description_test_case;

create table gen_description_test_case ( i_description_test_id integer identity primary key, c_test_case_name varchar (100), c_description varchar (255)  );



insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name) values ('userName','meen','textbox','case_0000001');
insert into gen_prepare_test_data (c_widget_id ,c_widget_data ,c_widget_type ,c_test_case_name) values ('password','meen','textbox','case_0000001');

insert into gen_description_test_case (c_test_case_name ,c_description) values ('case_0000001','Login Test Case');