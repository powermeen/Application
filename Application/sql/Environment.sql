drop table if exists environment_table;

create table environment_table ( i_environment_id integer identity primary key, c_code varchar (100), c_name varchar (200), c_url varchar (200) ,i_status integer );

insert into environment_table (c_code ,c_name ,c_url,i_status) values ('loacl','Local Environment','http://localhost:8080/phoenix/',0);
insert into environment_table (c_code ,c_name ,c_url,i_status) values ('Beta Shipco','Beta Shipco Environment','http://phoenix.scan-it.com.sg/phoenix/Application.html',0);
insert into environment_table (c_code ,c_name ,c_url,i_status) values ('Staging Shipco','Staging Shipco Environment','http://staging.phoenix.shipco.com/phoenix/Application.html',1);


