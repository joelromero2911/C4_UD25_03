DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

create table almacenes(
    codigo int auto_increment,
    lugar varchar(100),
    capacidad int,
    primary key (codigo)
);

create table cajas(
    num_referencia varchar(5),
    contenido varchar(100),
    valor int,
    almacen int,
    primary key (num_referencia),
    constraint cajas_fk foreign key (almacen) references almacenes(codigo)
    on update cascade on delete cascade
);

insert into almacenes (lugar, capacidad)values('Vila', 2);
insert into almacenes (lugar, capacidad)values('Vila', 3);
insert into almacenes (lugar, capacidad)values('Reus', 4);
insert into almacenes (lugar, capacidad)values('Reus', 5);
insert into almacenes (lugar, capacidad)values('Salou', 3);

insert into cajas (num_referencia, contenido, valor, almacen)values('ASD01', 'patatas', 2, 1);
insert into cajas (num_referencia, contenido, valor, almacen)values('ASD02', 'peras', 3, 1);
insert into cajas (num_referencia, contenido, valor, almacen)values('ASD03', 'manzanas', 4, 2);
insert into cajas (num_referencia, contenido, valor, almacen)values('ASD04', 'platanos', 2, 3);
insert into cajas (num_referencia, contenido, valor, almacen)values('ASD05', 'melocotones', 3, 4);