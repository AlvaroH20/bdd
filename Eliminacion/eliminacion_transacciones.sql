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
values(10,'12345',120.5,'C','01/01/2024','07:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(11,'12346',1000,'D','02/01/2024','09:30')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(12,'12347',2800,'C','03/01/2024','07:30')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(13,'12348',1065,'D','04/08/2024','10:10')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(14,'12349',1500.5,'C','05/01/2024','11:02')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(15,'12344',201,'D','06/09/2023','15:40')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(16,'12343',656.4,'C','07/01/2024','14:15')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(17,'12342',7885.6,'C','08/01/2024','16:03')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(18,'12341',8900.6,'C','09/08/2024','08:50')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(19,'12340',1020.4,'D','10/08/2024','17:09')
--selects
select * from transacciones
select * from transacciones where tipo like 'D'
select * from transacciones where monto between money(200) and money(2000)
select codigo,monto,tipo,fecha from transacciones where fecha is not null
--updates
update transacciones set tipo='T'
where monto between money(100) and money(500) and extract(month from fecha)=9 and cast(hora as time)between '14:00' and '20:00'
--deletes
delete from transacciones where extract(month from fecha)=8 and cast(hora as time)between'14:00' and '18:00'