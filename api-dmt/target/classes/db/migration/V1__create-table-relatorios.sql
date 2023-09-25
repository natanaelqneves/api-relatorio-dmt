create table relatorios(

id bigint not null auto_increment,
    data varchar(10) not null,
    turno varchar(10) not null,
    matricula varchar(8) not null,
    placa varchar(7) not null,
    inicial_km int not null,
    final_km int not null,
    radio int not null,
    cones int not null,

    primary key (id)
);