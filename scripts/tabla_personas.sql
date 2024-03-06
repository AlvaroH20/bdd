drop table personas
create table personas ( 
	cedula char(10) not null, 
	nombre varchar(50) not null, 
	apellido varchar (50) not null, 
	estatura decimal, 
	fecha_nacimiento date, 
	hora_nacimiento time , 
	cantidad_ahorrada money , 
	numero_hijos int , 
constraint personas_pk primary key (cedula) 
)
insert into personas(cedula , nombre , apellido)
values ('1714616123' , 'Santiago' , 'Mosquera') 
		
insert into personas(cedula , nombre , apellido, estatura)
values ('1714616124' , ' Pepe' , 'Mujica' ,1.85) 
	
insert into personas (cedula , nombre, apellido, numero_hijos) 
values ( '1714616125' , 'Santiago' , 'Ramos' ,2)

insert into personas (cedula , nombre, apellido, numero_hijos, estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada) 
values ( '1714616126' , 'Estefania' , 'Rosales' ,1,1.58,'22/05/2000','22:54',200.34)
 
select cedula,nombre,numero_hijos,estatura from personas
select * from personas
--para actualizar
update personas set estatura=1.70 where cedula='1714616125'
update personas set cantidad_ahorrada=0 where cantidad_ahorrada is null