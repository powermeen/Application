drop table if exists gen_user;

create table gen_user ( i_user_id integer identity primary key, c_user_name varchar (30), c_password varchar (30), c_user_role varchar (30) );

drop table if exists gen_user_permission;

create table gen_user_permission ( i_permission_id integer identity primary key, c_user_role varchar (30), c_module_name varchar (30), i_status integer (10) );

drop table if exists gen_role;

create table gen_user_permission ( i_role_id integer identity primary key, c_role_name varchar (100) c_user_role varchar (30) );
