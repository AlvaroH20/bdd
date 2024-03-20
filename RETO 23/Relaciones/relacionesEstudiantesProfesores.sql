create table estudiantesR(
	cedula char(10)primary key,
	nombre varchar(50)not null,
	apellido varchar(50)not null,
	email varchar(50)not null,
	fecha_nacimiento date,
	codigo_profesor int
)
select * from estudiantesR
----------------------------
create table profesoresR(
	codigo int,
	nombre varchar(50)not null,
	constraint estudiantesR_profesoresR_pk primary key(codigo)
)
select * from profesoresR
--relacion
alter table estudiantesR 
add constraint estudiantesR_codigo_profesor_fk 
foreign key (codigo_profesor)
references profesoresR(codigo);
--inserts profesoresR
insert into profesoresR(codigo,nombre)
values
	(666,'Mateo'),
	(777,'Juan'),
	(888,'Francisco'),
	(111,'Alan'),
	(222,'Morita'),
	(333,'Carla'),
    (444,'Elena'),
    (555,'Pedro'),
    (999,'Luisa'),
    (1010,'Sofia');
--inserts estudiantesR
insert into estudiantesR(cedula, nombre, apellido, email, fecha_nacimiento, codigo_profesor)
values
    ('1234567890', 'Ana', 'Martínez', 'ana@krake.com', '2000-05-15', 666),
    ('2345678901', 'David', 'García', 'david@krake.com', '2001-08-20', 777),
    ('3456789012', 'Laura', 'López', 'laura@krake.com', '1999-12-10', 888),
    ('4567890123', 'Carlos', 'Pérez', 'carlos@krake.com', '2002-04-25', 111),
    ('5678901234', 'María', 'Gómez', 'maria@krake.com', '2003-10-05', 222),
    ('6789012345', 'Eva', 'Rodríguez', 'eva@krake.com', '2000-07-30', 333),
    ('7890123456', 'Javier', 'Hernández', 'javier@krake.com', '2001-01-18', 444),
    ('8901234567', 'Andrea', 'Fernández', 'andrea@krake.com', '2002-06-12', 555),
    ('9012345678', 'Daniel', 'González', 'daniel@krake.com', '2003-03-08', 999),
    ('0123456789', 'Lucía', 'Díaz', 'lucia@krake.com', '2004-09-22', 1010),
    ('1234567891', 'Marta', 'Martínez', 'marta@krake.com', '2000-11-15', 666),
    ('2345678902', 'Juan', 'García', 'juan@krake.com', '2001-07-20', 777);