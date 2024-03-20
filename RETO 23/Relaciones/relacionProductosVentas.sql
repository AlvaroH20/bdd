create table productosR(
	codigo int not null primary key,
	nombre varchar(50)not null,
	descripcion varchar(200),
	precio money not null,
	stock int not null
)
select * from productosR
create table ventasR(
	id_venta int,
	codigo_producto int not null,
	fecha_venta date not null,
	catidad int,
	constraint ventasR_pk primary key(id_venta)
)
select * from ventasR
--relacion
alter table ventasR 
add constraint ventas_producto_fk 
foreign key (codigo_producto)
references productosR(codigo);
--inserts productosR
insert into productosR(codigo, nombre, descripcion, precio, stock)
values
    (106, 'Manzanas','Bolsa de manzanas maduras', 2.50, 60),
    (107, 'Melocotones','Fruta dulce y jugosa', 3.20, 45),
    (108, 'Jamón Serrano', 'Producto ibérico de alta calidad', 12.75, 30),
    (109, 'Miel', 'Tarro de miel natural', 6.99, 25),
    (110, 'Té de Manzanilla', 'Infusión relajante', 4.50, 50),
    (111, 'Yogur de Mango','', 2.00, 40),
    (112, 'Lechuga','Hojas frescas de lechuga', 1.80, 55),
    (113, 'Pimientos','Verduras rojas y verdes', 2.30, 35),
    (114, 'Aceitunas','Fruto del olivo', 3.75, 20),
    (115, 'Queso Manchego', 'Queso típico de La Mancha', 9.50, 15);
--inserts ventasR
insert into ventasR(id_venta, codigo_producto, fecha_venta, catidad)
values
    (1, 106, '2024-03-20', 5),
	(2, 107, '2024-03-21', 3),
    (3, 108, '2024-03-22',2),
    (4,109, '2024-03-23', 4),
    (5,110, '2024-03-24',5),
    (6,111, '2024-03-25', 1),
    (7,112, '2024-03-26',3),
    (8, 113, '2024-03-27', 2),
    (9, 114, '2024-03-28', 4),
    (10,115, '2024-03-29', 5);