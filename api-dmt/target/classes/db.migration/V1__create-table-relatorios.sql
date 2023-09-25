create table relatorios(


id bigint not null auto_increment,
    data varchar(10) not null,
    turno varchar(10) not null,
    matricula varchar(8) not null,
    placa varchar(7) not null,
    inicialKm int not null,
    finalKm int not null,
    radio int not null,
    cones int not null,

    primary key (id)
);