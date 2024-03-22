--relacion muchos a muchos
create table productos(
	codigo int not null,
	nombre varchar(50)not null,
	stock int not null,
	constraint productos_pk primary key(codigo)
)
create table proveedores( 
	codigo int not null, 
	nombre varchar(50) not null, 
	telefono char(10) not null, 
	constraint proveedores_pk primary key(codigo) 
)
--tabla de rompimiento
create table productos_por_proveedor(
	pp_codigo_producto int not null,
	pp_codigo_proveedor int not null,
	precio money not null,
	constraint producto_fk foreign key (pp_codigo_producto) references productos(codigo),
	constraint proveedor_fk foreign key (pp_codigo_proveedor) references proveedores(codigo),
	--clave compuesta
	constraint productos_por_proveedor_pk primary key(pp_codigo_producto,pp_codigo_proveedor)
)
insert into productos (codigo, nombre , stock) 
values (100,'Doritos' ,100); 
insert into productos (codigo, nombre , stock) 
values (200,'Kchitos' ,200); 
insert into productos (codigo, nombre , stock) 
values (300,'Papas' ,300); 
insert into productos (codigo, nombre , stock) 
values (400,'Takis' ,0); 

select * from productos

insert into proveedores (codigo, nombre , telefono) 
values (1,'Snacks SA' ,'0987156489'); 
insert into proveedores (codigo, nombre , telefono) 
values (2,'DistriSnacks' ,'0914578569'); 

select * from proveedores

insert into productos_por_proveedor(pp_codigo_producto,pp_codigo_proveedor,precio)
values(300,1,0.48);
insert into productos_por_proveedor(pp_codigo_producto,pp_codigo_proveedor,precio)
values(300,2,0.49);
insert into productos_por_proveedor(pp_codigo_producto,pp_codigo_proveedor,precio)
values(100,1,0.50);
insert into productos_por_proveedor(pp_codigo_producto,pp_codigo_proveedor,precio)
values(200,1,0.41);
insert into productos_por_proveedor(pp_codigo_producto,pp_codigo_proveedor,precio)
values(400,2,0.50);

select * from productos_por_proveedor

--select o consultas 
select prod.codigo,prod.nombre,prov.nombre, pp.precio from productos prod,proveedores prov,productos_por_proveedor pp
where pp.pp_codigo_producto=prod.codigo 
and pp.pp_codigo_proveedor=prov.codigo
and prod.codigo=300
