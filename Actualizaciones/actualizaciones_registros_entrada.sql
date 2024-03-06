drop table registros_entrada
create table registros_entrada(
	codigo_registro int not null,
	cedula_empleado char(10) not null,
	fecha date not null,
	hora time not NULL,
	constraint registros_entrada_pk primary key (codigo_registro)
)
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(1,'1234567891','01/02/2024','09:30')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(2,'1234567892','02/01/2024','10:30')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(3,'1234567893','03/02/2024','11:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(4,'1234567894','04/08/2023','08:28')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(5,'1234567895','05/01/2024','13:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(6,'1234567896','06/02/2024','15:30')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(7,'1234567897','07/01/2024','16:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(8,'1234567898','08/02/2024','09:00')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(9,'1234567899','09/08/2023','07:21')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(10,'1234567810','10/08/2023','14:20')

select * from registros_entrada
--selecciones
select cedula_empleado,fecha,hora from registros_entrada
select * from registros_entrada where hora between '07:00' and '14:00'
select * from registros_entrada where hora > '08:00'
--updates
update registros_entrada set cedula_empleado='082345679'where extract(month from fecha)=8