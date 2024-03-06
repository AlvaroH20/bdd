drop table videojuegos
create table videojuegos(
	codigo int not null,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int not null,
	constraint videojuegos_pk primary key(codigo)
)
--5 inserts con todos los campos
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(10,'Valorant','Shooter tactico',10)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(9,'Minecraft','Aventura de cubos',10)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(8,'CS-GO','Shooter tactico',9)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(7,'Terraria','Es un minecraft 2D',8)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(6,'Sonic Racing','Carreras con Sonic',9)
--3 inserts campos obligatorios
insert into videojuegos(codigo,nombre,valoracion)
values(5,'Dong King Kong',7)
insert into videojuegos(codigo,nombre,valoracion)
values(4,'Club Penguin',5)
insert into videojuegos(codigo,nombre,valoracion)
values(3,'Overwatch',6)

select * from videojuegos
--seleciones
select * from videojuegos where nombre like 'C%'
select * from videojuegos where valoracion between 9 and 10
select * from videojuegos where descripcion is null