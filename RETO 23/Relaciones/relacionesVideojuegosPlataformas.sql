create table videojuegosR(
	codigo int not null primary key,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int not null
)
select * from videojuegosR
------------------------------
create table plataformasR(
	id_plataforma int,
	nombre_plataforma varchar(50)not null,
	codigo_videojuego int,
	constraint plataformasR_pk primary key(id_plataforma)
)
select * from plataformasR
--relacion
alter table plataformasR 
add constraint plataformas_videojuegos_fk 
foreign key (codigo_videojuego)
references videojuegosR(codigo);
--inserts videojuegosR
insert into videojuegosR(codigo, nombre, descripcion, valoracion)
values
    (999,'Minecraft', 'Aventura', 10),
    (1000, 'Call of Duty', 'Guerra', 9),
    (1001,'Civilization VI', 'Estrategia', 8),
    (1002, 'Dead Space', 'Survival', 9),
    (1003, 'Gears of War', 'Shooter', 8),
    (1004, 'Dark Souls', 'Rol',9),
    (1005, 'Doom', 'Disparos', 9),
    (1006, 'Cuphead', 'Plataformas', 9),
    (1007, 'Dying Light', 'Survival horror', 8),
    (1008, 'God of War', 'Accion', 10);
--inserts plataformasR
insert into plataformasR(id_plataforma, nombre_plataforma, codigo_videojuego)
values
    (1, 'PlayStation 4', 1008),
    (2, 'Xbox One', 1003),
    (3, 'PC', 1000),
    (4, 'Nintendo Switch', 1006),
    (5, 'PlayStation 5', 999),
    (6, 'Xbox Series X', 1005),
    (7, 'PC', 1001),
    (8, 'PlayStation 4', 1004),
    (9, 'Xbox One', 1007),
    (10, 'Nintendo Switch', 1002);