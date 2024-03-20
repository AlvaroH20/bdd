create table personaR(
	cedula char(10) primary key not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	estatura decimal,
	fecha_nacimiento date not null,
	hora_nacimiento time,
	cantidad_ahorrada money,
	numero_hijos int
)
select * from personaR
-----------------------
create table prestamoR(
	cedula char(10) not null,
	monto money,
	fecha_prestamo date,
	hora_prestamo time,
	garante varchar(40),
	constraint prestamo_pk PRIMARY key(cedula)
)
select * from prestamoR
--relacion
alter table prestamoR 
add constraint prestamoR_cedula_fk 
foreign key (cedula)
references personaR(cedula);
--insert personaR
insert into personaR(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)
values('1248569321', 'Paco', 'Plaza', 1.70, '1998-04-15', '07:50:00', 100, 4),
	 ('2345678912', 'Ana', 'Gómez', 1.65, '1995-10-20', '08:30:00', 150, 2),
    ('3456789123', 'Sean', 'López', 1.80, '1990-07-12', '09:45:00', 800, 3),
    ('4567891234', 'María', 'Martínez', 1.60, '1988-03-25', '10:20:00', 120, 1),
    ('5678912345', 'Pedro', 'Hernández', 1.75, '1992-12-05', '11:15:00', 180, 2),
    ('6789123456', 'Sofía', 'Fernández', 1.68, '1997-06-30', '12:00:00', 220, 3),
    ('7891234567', 'Lucía', 'García', 1.73, '1994-09-18', '07:40:00', 130, 2),
    ('8912345678', 'Diego', 'Díaz', 1.85, '1996-11-08', '08:55:00', 250, 4),
    ('9123456789', 'Elena', 'Rodríguez', 1.62, '1991-02-14', '10:10:00', 570, 2),
    ('0012345678', 'Carla', 'Pérez', 1.70, '1993-05-30', '11:30:00', 990, 3);
--insert prestamoR
insert into prestamoR(cedula, monto, fecha_prestamo, hora_prestamo, garante)
values('1248569321',955.00,'1999-01-26','13:00:00','Garante1'),
	('2345678912', 800.00, '2000-05-10', '14:30:00', 'Garante2'),
    ('3456789123', 1000.00, '2001-08-15', '15:45:00', 'Garante3'),
    ('4567891234', 650.00, '2002-03-18', '16:20:00', 'Garante4'),
    ('5678912345', 1000.00, '2003-11-20', '17:15:00', 'Garante5'),
    ('6789123456', 1000.00, '2004-07-30', '18:00:00', 'Garante6'),
    ('7891234567', 850.00, '2005-09-18', '13:40:00', 'Garante7'),
    ('8912345678', 700.00, '2006-12-08', '14:55:00', 'Garante8'),
    ('9123456789', 800.00, '2007-04-14', '16:10:00', 'Garante9'),
    ('0012345678', 950.00, '2008-06-30', '17:30:00', 'Garante10');
