create table pessoas_teste(

    id bigint not null auto_increment,
    matricula varchar(8) not null,
    funcao varchar() not null,
    primeiroNome varchar(20) not null,
    segundoNome varchar(20) not null,
    turno varchar(10) not null,

    primary key (id)

);