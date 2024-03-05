drop table productos
create table productos(
	codigo int not null,
	nombre varchar(50) not null,
	descripcion varchar(200),
	precio money not null,
	stock int not null,
	constraint productos_pk primary key(codigo)
)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(124,'Noddles','Deliciosos fideos asiaticos',4.5,56)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(125,'Onigiris','Bola de arroz rellena',2.9,24)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(126,'Gyosas','Empanadillas japonesas',3.5,16)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(122,'Omurice','Arroz frito tradicional',4.85,10)
insert into productos(codigo,nombre,descripcion,precio,stock)
values(127,'Algas Marinas','Algas para sushi extra pack',7.6,66)

select * from productos
