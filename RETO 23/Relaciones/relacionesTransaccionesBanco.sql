create table transaccionesR(
	codigo int primary key,
	numero_cuenta char(5)not null,
	monto money not null,
	tipo char(1)not null,
	fecha date,
	hora time
)
select * from transaccionesR
----------------------------
create table bancoR(
	codigo_banco int,
	codigo_transaccion int,
	detalle varchar(100),
	constraint banco_pk primary key(codigo_banco)
)
select * from bancoR
--relaciones
alter table bancoR 
add constraint bancoR_codigo_transaccionesR_fk 
foreign key (codigo_transaccion)
references transaccionesR(codigo);
--insert transaccionesR
insert into transaccionesR(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(1, '78569', 500, 'C', '2023-05-01', '16:10:00'),
    (11, '22001', 700, 'C', '2023-05-05', '08:30:00'),
    (12, '22002', 450, 'C', '2023-05-10', '09:45:00'),
    (13, '22003', 850, 'C', '2023-05-15', '11:20:00'),
    (14, '22004', 300, 'D', '2023-05-20', '13:15:00'),
    (15, '78570', 600, 'C', '2023-05-25', '14:00:00'),
    (16, '78571', 350, 'D', '2023-05-30', '15:40:00'),
    (17, '78572', 900, 'C', '2023-06-05', '17:55:00'),
    (18, '78573', 200, 'D', '2023-06-10', '19:10:00'),
    (19, '78574', 1000, 'C', '2023-06-15', '20:30:00');
--insert bancoR
insert into bancoR(codigo_banco,codigo_transaccion,detalle)
values(1, 1, 'Transferencia'),
	(2, 11, 'Transferencia'),
    (3, 12, 'Transferencia'),
    (4, 13, 'Transferencia'),
    (5, 14, 'Retiro'),
    (6, 15, 'Transferencia'),
    (7, 16, 'Retiro'),
    (8, 17, 'Transferencia'),
    (9, 18, 'Retiro'),
    (10, 19, 'Transferencia');