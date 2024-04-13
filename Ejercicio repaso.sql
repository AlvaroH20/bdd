--tablas que se van a relacionar no olvidar los parentesis en los atributos
create table libros
(isbn char(10) not null,
nombre varchar(30) not null,
numero_paginas int,
constraint libros_pk primary key(isbn))

create table cliente
(cedula char(10) not null,
nombre varchar(30) not null,
constraint cliente_pk primary key(cedula))

select * from cliente
select * from libros
select * from reserva
--Tabla de relacion muchos a muchos
create table reserva 
(id char(5) not null,
isbn_libro char(10) not null,
cedula_cliente char(10)not null,
fecha_reserva date,
fecha_devolucion date,
constraint reserva_pk foreign key(isbn_libro) references libros(isbn),
constraint reservaCli_pk foreign key(cedula_cliente) references cliente(cedula),
constraint reservar_pk primary key (id)
)
--referencia tabla de claves primarias por foreign keys
create table reserva2 
(
isbn_libro char(10) not null,
cedula_cliente char(10)not null,
fecha_reserva date,
fecha_devolucion date,
constraint reserv_pk foreign key(isbn_libro) references libros(isbn),
constraint reservaCl_pk foreign key(cedula_cliente) references cliente(cedula),
constraint reservarp_pk primary key (isbn_libro,cedula_cliente)
)
select * from reserva2
--table realcion uno a muchos 
create table direccion
(
id_direccion serial not null,
calle1 varchar(50),
calle2 varchar(50),
constraint direccion_pk primary key(id_direccion)
)
insert into direccion (calle1,calle2) values ('A','B')
select * from direccion
--esta es la relacion xd
alter table cliente add column direccion int 
alter table cliente add
constraint clienteDir_fk foreign key(direccion)references direccion(id_direccion)
update cliente set direccion = 1 where cedula='1234567891'