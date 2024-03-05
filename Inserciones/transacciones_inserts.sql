drop table transacciones
create table transacciones(
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char(1) not null,
	fecha date not null,
	hora time not null,
	constraint transacciones_pk primary key(codigo)
)
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(10,'12345',12.5,'C','01/01/2024','07:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(11,'12346',10,'D','02/01/2024','09:30')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(12,'12347',18.7,'C','03/01/2024','07:30')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(13,'12348',20.3,'D','04/01/2024','10:10')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(14,'12349',25.5,'C','05/01/2024','11:02')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(15,'12344',9.6,'D','06/01/2024','08:40')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(16,'12343',56.4,'C','07/01/2024','14:15')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(17,'12342',75.6,'C','08/01/2024','16:03')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(18,'12341',89.6,'C','09/01/2024','08:50')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(19,'12340',102.4,'D','10/01/2024','18:09')

select * from transacciones