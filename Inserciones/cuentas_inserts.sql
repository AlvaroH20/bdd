drop table cuentas
create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint cuentas_pk primary key(numero_cuenta)
)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12345','78963','05/03/2024',150.6)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values ('12346','78953','15/02/2024',259.63)
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

select * from cuentas