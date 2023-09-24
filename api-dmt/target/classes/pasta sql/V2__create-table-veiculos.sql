create table veiculos(

    id bigint not null auto_increment,
    placa varchar(7) not null,
    modelo varchar(15) not null,
    totalKm int() not null,
    radio int() not null,
    cones int() not null,

    primary key (id)

);