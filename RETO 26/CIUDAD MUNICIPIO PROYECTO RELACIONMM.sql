create table ciudad(
	id int, 
	nombre varchar(45) not null,
	constraint ciudad_pk primary key(id)
)
create table municipio( 
	id_municipio int, 
	nombre varchar(45), 
	ciudad_id int,
	constraint municipio_pk primary key(id_municipio), 
	constraint ciudad_fk foreign key(ciudad_id) references ciudad(id)
)
create table proyecto(
	id_proyecto int, 
	proyecto varchar(50) not null,
	monto money not null,
	fecha_inicio date,
	fecha_entrega date,
	constraint proyecto_pk primary key(id_proyecto)
)
--tabla de rompimiento
create table proyecto_municipio(
	proyecto_id int not null,
	municipio_id int not null,
	constraint Smunicipio_fk foreign key (municipio_id) references municipio(id_municipio),
	constraint Sproyectos_fk foreign key (proyecto_id) references proyecto(id_proyecto),
	--clave compuesta
	constraint proyecto_municipio_pk primary key(municipio_id,proyecto_id)
)
--inserts dados
insert into ciudad values   (1,'Quito'),
							(2,'Ambato'),
							(3,'Guayaquil'),
							(4,'Machala'),
							(5,'Manta'),
							(6,'Loja'),
							(7,'Otavalo'),
							(8,'Cuenca'),
							(9,'Latacunga'),
							(10,'Tena');


insert into municipio values (1,'GAD MUNICIPAL QUITO',1),
							 (2,'GAD MUNICIPAL DE CUENCA',8),
							 (3,'GAD MUNICIPALIDAD DE AMBATO',2),
							 (4,'MUNICIPALIDAD DE MACAHALA ',4),
							 (5,'MUNIUCIPIO DE GUAYAQUIL',3),
							 (6,'MUNICIPIO DE OTAVALO',7),
							 (7,'MUNICIPIO DE LOJA',6),
							 (8,'MUNICIPIO DE MANTA',5),
							 (9,'MUNICIPIO DE LATACUNGA',9),
							 (10,'MUNICIPIO DE TENA',10);


insert into proyecto values (1,'Proyectos de Gestión Ambiental',9543.327,'10/02/2022','10/02/2023'),
							(2,'Proyectos en Fomento y Desarrollo Productivo',26553.264,'25/06/2022','10/08/2022'),
							(3,'Proyectos en Cambio Climático',1292.194,'01/02/2021','10/12/2023');
							

insert into proyecto_municipio values (1,5),
									  (3,5),
									  (1,2),
									  (2,1),
									  (1,4),
									  (2,9),
									  (1,10),
									  (3,6),
									  (1,3),
									  (2,7);
--CONSULTAS 1 MUNICIPIO PROYECTOS
select mu.nombre,pr.proyecto
from municipio mu, proyecto pr, proyecto_municipio pm
where mu.id_municipio=pm.municipio_id 
and pr.id_proyecto=pm.proyecto_id
--subconsulta 1
select pr.proyecto
from proyecto pr
where pr.id_proyecto in( 
	select pm.proyecto_id
	from proyecto_municipio pm
	where pm.municipio_id=1
)
--agregacion 1
select  mu.nombre,count(pm.proyecto_id)
from municipio mu, proyecto_municipio pm
where mu.id_municipio=pm.municipio_id
group by (mu.nombre)
--consulta 2
select mu.nombre,pr.proyecto
from municipio mu, proyecto pr, proyecto_municipio pm
where mu.id_municipio=pm.municipio_id 
and pr.id_proyecto=pm.proyecto_id 
and mu.nombre like('%GAD%')
--Agregacion 2
select mu.nombre,min(pm.proyecto_id)
from municipio mu,proyecto_municipio pm
where mu.id_municipio=pm.municipio_id
group by (mu.nombre)
------------------------------------------------------
--Consulta 3 
select mu.nombre, ci.nombre
from municipio mu,ciudad ci
where ci.id= mu.ciudad_id
--Subconsulta 3
select pr.proyecto
from proyecto pr
where pr.id_proyecto in( 
	select pm.proyecto_id
	from proyecto_municipio pm
	where pm.municipio_id=3
)
--agregacion 3
select  mu.nombre,max(pm.proyecto_id) as valor_maximo_de_proyectos
from municipio mu, proyecto_municipio pm
where mu.id_municipio=pm.municipio_id
group by (mu.nombre)