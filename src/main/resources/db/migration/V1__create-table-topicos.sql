create table topicos(

id bigint not null auto_increment primary key,
titulo varchar (100) not null,
mensaje varchar (100) not null,
autor varchar (100) not null,
curso varchar (100) not null,
fecha_creacion datetime default current_timestamp

);