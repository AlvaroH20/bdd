drop table cuentas
create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint cuentas_pk primary key(numero_cuenta)
)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12345','10963','05/03/2024',150.6)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12346','10953','15/02/2024',259.63)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12347','78954','10/02/2024',456)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12348','78952','06/02/2024',54.95)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12349','78955','22/02/2024',212)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12350','78957','01/02/2024',167.54)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12357','78989','04/01/2024',759.6)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12389','78947','20/01/2024',1542.6)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12399','78999','11/01/2024',685.4)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12377','79001','07/01/2024',866.2)
--inserts de prueba 
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('17378','17790','07/01/2024',108)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('17379','17290','17/02/2024',86)
select * from cuentas
--selects
select numero_cuenta,saldo from cuentas
select * from cuentas where fecha_creacion between NOW()-INTERVAL'2 months' and NOW()
select numero_cuenta,saldo from cuentas where fecha_creacion between NOW()-INTERVAL'2 months' and now()
--updates
update cuentas set saldo=10 where cedula_propietario like '17%'
--deletes
delete from cuentas where cedula_propietario like '10%'
