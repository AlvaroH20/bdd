drop table productos
create table productos(
	codigo int not null,
	nombre varchar(50) not null,
	descripcion varchar(200),
	precio money not null,
	stock int not null,
	constraint productos_pk primary key(codigo)
)
--5 inserts en todos los campos
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
--solo con los campos obligatorios
insert into productos(codigo,nombre,precio,stock)
values(128,'Palillos',1.2,104)
insert into productos(codigo,nombre,precio,stock)
values(129,'Hielo',0.64,107)
insert into productos(codigo,nombre,precio,stock)
values(130,'Servilletas',0.50,206)
--inserts de prueba 
insert into productos(codigo,nombre,precio,stock)
values(131,'Queso',2.25,13)
select * from productos
--selects
select * from productos where nombre like'Q%'
select * from productos where descripcion is null
select * from productos where precio between money(2) and money(3)