create table cuentasR(
	numero_cuenta char(5) PRIMARY KEY,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null
)
select * from cuentasR
create table usuarioR(
	cedula char(5) not null,
	nombre varchar(25) not null,
	apellido varchar(25) not null,
	tipo_cuenta varchar(20),
	limite_credito decimal(10,5),
	constraint usuarioR_pk primary key(cedula)
)
select * from usuarioR
--relacion
alter table cuentasR 
add constraint cuentasR_cedula_propietario_fk 
foreign key (cedula_propietario)
references usuarioR(cedula);
--inserts usuarioR
insert into usuarioR (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values('601','Leonel','Messi','ahorros',150),
	('602', 'Cristiano', 'Ronaldo', 'corriente',200),
    ('603','Neymar', 'Jr', 'ahorros',300),
    ('604','Lionel', 'Andres', 'corriente',400),
    ('605', 'Kylian', 'Mbappe', 'ahorros',500),
    ('606','Robert', 'Lewandowski', 'corriente',600),
    ('607', 'Mohamed', 'Salah', 'ahorros',700),
    ('608', 'Sergio', 'Ramos', 'corriente',800),
    ('609','Kevin', 'De Bruyne', 'ahorros',900),
    ('610', 'Virgil', 'Van Dijk','corriente',1000);
--inserts cuentasR
insert into cuentasR (numero_cuenta, cedula_propietario, fecha_creacion, saldo)
values('10001','601','2022-08-25', 150),
    ('10002','602', '2022-09-10', 250),
    ('10003','603', '2022-10-15', 350),
    ('10004','604', '2022-11-20', 450),
    ('10005','605', '2022-12-25', 550),
    ('10006','606', '2023-01-05', 650),
    ('10007','607', '2023-02-10', 750),
    ('10008','608', '2023-03-15', 850),
    ('10009','609', '2023-04-20', 950),
    ('10010','610', '2023-05-25', 1050);