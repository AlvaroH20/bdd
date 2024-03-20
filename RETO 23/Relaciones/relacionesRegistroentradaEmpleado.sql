create table registros_entradaR(
	codigo_registro int not null primary key,
	cedula_empleado char(10)not null,
	fecha date not null,
	hora time not null,
	codigo_empleado int not null
)
select * from registros_entradaR
--------------------------
create table empleadoR(
	codigo_empleado int not null,
	nombre varchar(25)not null,
	fecha date not null,
	hora time not null,
	constraint empleadoR_pk primary key(codigo_empleado) 
)
select * from empleadoR
--relacion
alter table registros_entradaR 
add constraint registros_entradaR_codigo_empleado_fk 
foreign key (codigo_empleado)
references empleadoR(codigo_empleado);
--inserts empleadoR
insert into empleadoR(codigo_empleado, nombre, fecha, hora)
values
    (7001,'Francisco', '2023-09-05', '08:30:00'),
    (7002,'Juan', '2023-08-10', '09:15:00'),
    (7003,'Pedro', '2023-10-20', '10:30:00'),
    (7004,'María', '2023-11-15', '11:45:00'),
    (7005,'Sofía', '2023-09-30','08:10:00'),
    (7006,'Ana', '2023-12-05', '12:20:00'),
    (7007,'Luis', '2023-11-25', '09:00:00'),
    (7008,'Laura', '2023-08-25', '10:00:00'),
    (7009,'Carlos', '2023-10-15', '08:40:00'),
    (2201,'Diego', '2023-11-10', '13:00:00');
--insert registroentrada
insert into registros_entradaR(codigo_registro, cedula_empleado, fecha, hora, codigo_empleado)
values
    (01, '1145632159', '2023-08-07', '08:10:00', 2201),
    (02, '2234567891', '2023-08-15', '09:00:00', 7002),
    (03, '3334567892', '2023-09-25', '10:30:00', 7005),
    (04, '4434567893', '2023-10-12', '11:45:00', 7009),
    (05, '5534567894', '2023-11-20', '08:05:00', 7001),
    (06, '6634567895', '2023-12-01', '12:10:00', 7006),
    (07, '7734567896', '2023-08-30', '08:50:00', 7008),
    (08, '8834567897', '2023-09-15', '09:20:00', 7003),
    (09, '9934567898', '2023-10-05', '10:15:00', 7007),
    (10, '0034567899', '2023-11-10', '13:00:00', 7004);