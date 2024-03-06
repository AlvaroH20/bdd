drop table estudiantes
create table estudiantes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date not null,
	constraint estudiantes_pk primary key(cedula)
)
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567891','Kevin','Perez','kevinperez@outlook.com','15/08/2000')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567892','Juan','Pazminio','juanelcaballo@outlook.es','22/01/2001')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567893','Jona','Martinez','martinezzz@outlook.com','05/02/2003')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567894','Paco','Palacios','PalaPalacios@outlook.com','20/06/2004')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567895','Daniel','Zurita','DanielZuu@outlook.com','02/07/2000')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567896','Pamela','Hernandez','pamelitaH@outlook.com','11/03/2001')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567897','Rosa','Solis','solises@outlook.com','12/04/1999')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1234567898','Sofia','Saltos','sofiSalta@outlook.com','09/01/2004')
--inserts de prueba
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1734567898','Maria','Salmon','salmonmonmon@outlook.com','17/09/2000')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1789567898','Paquita','Barrios','elbarrios@outlook.com','19/05/2006')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1746567898','Amelia','Barrera','labarrera@outlook.com','14/02/2001')
select * from estudiantes
--los select
select nombre, cedula from estudiantes
select nombre from estudiantes where cedula like '17%'
select nombre, apellido from estudiantes where nombre like 'A%'