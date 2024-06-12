create database Biblioteca;
use Biblioteca;

create table livro (
	IDLIVRO int auto_increment primary key,
    TITULO varchar(255) not null, #
    AUTOR varchar(255) not null, #
    GENERO varchar(255) not null, #
    EDITORA varchar(255) not null, #
    ANOPUBLICACAO int not null, #
    DATACAD timestamp default current_timestamp,
    ATIVO varchar(1) default 'S'
);

select * from livro;