--Usuario cuentas
--consulta
select cu.numero_cuenta,us.nombre 
from cuentasR cu,usuarioR us
where cu.cedula_propietario = us.cedula
and cu.saldo between money(100) and money(1000);
--subconsulta
select * 
from cuentasR cu,usuarioR us
where cu.cedula_propietario = us.cedula
and cu.fecha_creacion between '2022-09-21'and'2023-09-21';
--------------------------------------------------------------
--Clientes compras
--consulta
select cl.nombre,cl.apellido
from clientesR cl,comprasR co
where co.cedula = cl.cedula
and cl.cedula like '%7%';
--subconsulta
select *
from clientesR
where cedula = (
	select cedula
	from clientesR
	where nombre= 'Monica'
)
----------------------------------------------------------------
--Estudiantes y profesores
--consulta
select es.codigo_profesor,es.nombre,es.apellido
from estudiantesR es, profesoresR pr
where es.codigo_profesor = pr.codigo
and es.apellido like '%n%';
--subconsulta
select es.*
from estudiantesR es
where es.codigo_profesor =(
	select codigo
	from profesoresR 
	where nombre='Francisco'
);
-------------------------------------------------------------------
--Person y Prestamo
--consulta
select pe.cantidad_ahorrada,pr.monto,pr.garante
from personaR pe,prestamoR pr
where pr.cedula=pe.cedula
and pr.monto between money(100)and money(1000);
--subconsulta
select pe.*
from personaR pe,prestamoR pr
where pr.cedula=pe.cedula
and pe.nombre='Sean';
---------------------------------------------------------------------
--Productos y ventas
--consulta
select pro.nombre,pro.stock,ve.catidad,ve.id_venta
from productosR pro,ventasR ve
where ve.codigo_producto=pro.codigo
and pro.nombre like '%m%' or pro.descripcion is null;
--subconsulta
select pro.nombre,pro.stock
from productosR pro, ventasR ve
where ve.codigo_producto=pro.codigo
and ve.catidad=5;
---------------------------------------------------------------------
--Transacciones y Banco
--consulta
select * 
from transaccionesR tr, bancoR ba
where ba.codigo_transaccion = tr.codigo 
and tr.tipo = 'C'and tr.numero_cuenta between '22000' and '22004';
--subcaonsulta
select * 
from transaccionesR  
where codigo in(
	select codigo_transaccion 
	from bancoR 
	where codigo_banco =1 
)
----------------------------------------------------------------------
--Videojuegos y Plataformas
--consulta
select vi.nombre,vi.descripcion,vi.valoracion,pl.nombre_plataforma 
from videojuegosR vi, plataformasR pl 
where  vi.descripcion ='Guerra' 
and vi.valoracion > 7 or vi.nombre like 'C%' 
and vi.valoracion > 8 
and vi.nombre like 'D%';
--subconsulta
select * 
from plataformasR  
where codigo_videojuego =(
	select codigo 
	from videojuegosR 
	where nombre = 'God of War' 
)
-------------------------------------------------------------------------
--registro de entrada y empleado
--consulta
select re.cedula_empleado, re.fecha, em.nombre
from empleadoR em, registros_entradaR re
where (re.fecha between '2023-08-01' and '2023-08-31' 
	   and re.hora between '08:00' and '12:00' 
	   and re.cedula_empleado like '17%')
or (re.fecha between '2023-10-06' and '2023-10-20' 
	and re.hora between '09:00' and '13:00' 
	and re.cedula_empleado like '08%');
--subconsulta
select re.codigo_registro, em.nombre  
from registros_entradaR re, empleadoR em
where re.codigo_empleado = em.codigo_empleado and re.codigo_empleado in
(
	select codigo_empleado 
	from empleadoR 
	where codigo_empleado = '2201' 
);

