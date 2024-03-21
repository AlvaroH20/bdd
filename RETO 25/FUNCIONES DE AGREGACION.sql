--FUNCIONES DE AGREGACION
--RELACION CUENTAS CON USUARIO
select AVG(cast(cu.saldo as numeric))
from cuentasR cu,usuarioR us
where cu.cedula_propietario = us.cedula
and us.cedula='608';
--funcion de agregacion 2
select tipo_cuenta,count (cu.numero_cuenta)
from cuentasR cu,usuarioR us
where cu.cedula_propietario = us.cedula
group by tipo_cuenta
--FUNCIONES DE AGREGACION 
--RELACION CLIENTES COMPRAS 
--FUNCION DE AGREGACION 1 
select cl.cedula,SUM(co.monto) as monto_total_compras
from clientesR cl,comprasR co
where co.cedula = cl.cedula
group by (cl.cedula);
--FUNCION DE AGREGACION 2
select fecha_compra,count(fecha_compra)as total_compras
from comprasR
where fecha_compra='2023-09-01'
group by (fecha_compra);
--FUNCIONES DE AGREGACION 
--RELACION ESTUDIANTES PROFESORES
--FUNCION DE AGREGACION1
select codigo_profesor,count(codigo_profesor)astotal_estudiantes
from estudiantesR
group by(codigo_profesor);
--FUNCION DE AGREGACION 2
select ROUND(AVG(EXTRACT(YEAR FROM CURRENT_DATE)-
		EXTRACT(YEAR from fecha_nacimiento)))as edad_promedio
from estudiantesR;
--FUNCIONES DE AGREGACION 
--RELACION PERSONA PRESTAMO
--FUNCION DE AGREGACION 1
select pe.cedula, sum(pr.monto)as monto_total_prestamos
from personaR pe, prestamoR pr
where pr.cedula=pe.cedula
group by (pe.cedula);
--FUNCION AGREGACION 2
select count(*)as total_personas
from personaR
where personaR.numero_hijos>1;
--FUNCIONES DE AGREGACION 
--RELACION PRODUCTOS VENTAS
--FUNCION DE AGREGACION 1
select max(precio)as precio_maximo
from productosR;
--FUNCION AGREGACION 2
SELECT sum(catidad)as cantidad_total_vendida
from ventasR;
--FUNCIONES DE AGREGACION 
--RELACION TRANSACCIONES BANCO
--FUNCION DE AGREGACION 1
SELECT count(tipo)as total_transacciones_credito
from transaccionesR
where transaccionesR.tipo='C';
--FUNCION AGREGACION 2
SELECT numero_cuenta, round(avg(cast(monto as decimal)),2)as monto_promedio
from transaccionesR
group by numero_cuenta;
--FUNCIONES DE AGREGACION
--RELACION VIDEOJUEGOS PLATAFORMAS
--FUNCION DE AGREGACION 1
select codigo_videojuego,count(id_plataforma)as total_plataformas
from plataformasR
group by codigo_videojuego;
--FUNCION DE AGREGACION 2
SELECT round(avg(valoracion),2)as valoracion_promedio
from videojuegosR;
--FUNCIONES DE AGREGACION
--RELACION RegistrosEntrada EMPLEADO
--FUNCION DE AGREGACION 1
SELECT cedula_empleado,count(cedula_empleado)as total_registros_entrada
from registros_entradaR
group by cedula_empleado;
--FUNCION DE AGREGACION 2
select min(fecha)as fecha_minima, max(fecha)as fecha_maxima
from registros_entradaR;


