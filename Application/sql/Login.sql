drop table if exists gen_user;

create table gen_user ( i_user_id integer identity primary key, c_user_name varchar (30), c_password varchar (30), c_user_role varchar (30) );

drop table if exists gen_user_permission;

create table gen_user_permission ( i_permission_id integer identity primary key, c_user_role varchar (30), c_module_name varchar (30) , i_status  integer  );

drop table if exists gen_role;

create table gen_role ( i_role_id integer identity primary key, c_role_name varchar (100), c_user_role varchar (30) ,i_user_level integer );




insert into gen_user (c_user_name ,c_password ,c_user_role) values ('meen','meen','maker');
insert into gen_user (c_user_name ,c_password ,c_user_role) values ('admin','admin','admin');
insert into gen_user (c_user_name ,c_password ,c_user_role) values ('owner','owner','owner');
insert into gen_user (c_user_name ,c_password ,c_user_role) values ('office','office','office');

insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('maker','moduleA',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('maker','moduleB',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('maker','moduleC',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('maker','moduleD',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('maker','moduleE',1);

insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('admin','moduleA',0);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('admin','moduleB',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('admin','moduleC',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('admin','moduleD',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('admin','moduleE',1);

insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('owner','moduleA',0);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('owner','moduleB',0);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('owner','moduleC',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('owner','moduleD',1);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('owner','moduleE',1);

insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('office','moduleA',0);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('office','moduleB',0);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('office','moduleC',0);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('office','moduleD',0);
insert into gen_user_permission (c_user_role ,c_module_name ,i_status) values ('office','moduleE',1);

insert into gen_role (c_role_name ,c_user_role ,i_user_level) values ('maker','meen',0);
insert into gen_role (c_role_name ,c_user_role ,i_user_level) values ('admin','admin',1);
insert into gen_role (c_role_name ,c_user_role ,i_user_level) values ('owner','owner',2);
insert into gen_role (c_role_name ,c_user_role ,i_user_level) values ('office','office',3);



select i_user_id as userid , c_user_name as username , c_password as password , c_user_role as userrole from gen_user ;
