create table clientesR(
	cedula char(10)primary key,
	nombre varchar(50) not null,
	apellido varchar(50)not null
)
select * from clientesR
create table comprasR(
	id_compra int,
	cedula char(10)not null,
	fecha_compra date not null,
	monto decimal(10,2)not null,
	constraint comprasR_pk primary key(id_compra)
)
select * from comprasR
--relacion
alter table comprasR 
add constraint comprasR_cedula_fk 
foreign key (cedula)
references clientesR(cedula);
--inserts clientesR
insert into clientesR (cedula, nombre, apellido)
values
    ('1234567891', 'Monica', 'Vergara'),
    ('9876543210', 'Carlos', 'Lopez'),
    ('2468135790', 'Ana', 'Martinez'),
    ('1357924680', 'Juan', 'Gomez'),
    ('3692581470','Laura', 'Rodriguez'),
    ('1593572460', 'Pedro', 'Santos'),
    ('0246813579', 'Maria','Hernandez'),
    ('1230987456', 'Gabriel', 'Perez'),
    ('9871236540', 'Sofia', 'Garcia'),
    ('6547891230', 'Julio', 'Fernandez');
--inserts comprasR
insert into comprasR (id_compra, cedula, fecha_compra, monto)
values
    (50,'1234567891', '2023-04-11', 4.5),
    (51,'9876543210','2023-05-20', 10.25),
    (52,'2468135790', '2023-06-15', 20.50),
    (53,'1357924680','2023-07-10', 15.75),
    (54,'3692581470', '2023-08-05',30.00),
    (55, '1593572460','2023-09-01', 25.50),
    (56,'0246813579', '2023-10-10', 18.75),
    (57, '1230987456', '2023-11-15', 22.80),
    (58,'9871236540', '2023-12-20',28.90),
    (59,'6547891230', '2024-01-25', 35.75);

