create database formularios;
use formularios;

create table Cliente (
	Cod int not null primary key auto_increment,
	NomeCompleto varchar(30) NOT NULL,
	CPF varchar(11) NOT NULL,
	Endereco varchar(30),
	Telefone varchar(11),
	Email varchar(30),
	DataNasc date,
	Sexo varchar(10),
	EstadoCivil varchar(10),
	Profissao varchar(20)
);




create table Funcionario (
	Cod int not null primary key auto_increment,
	NomeCompleto varchar(30) NOT NULL,
	CPF varchar(11) NOT NULL,
	Endereco varchar(30),
	Telefone varchar(11),
	Email varchar(30),
	DataAdmissao date,
	Cargo varchar(20),
	Salario decimal(10,2),
	Departamento varchar(20)
);



create table Fornecedores(
	Cod int not null primary key auto_increment,
	NomeEmpresa varchar(30),
	CNPJ varchar(30),
	Endereco varchar(30),
	Telefone varchar(11),
	Email varchar(20),
	NomeContato varchar(30),
	TipoProdServ varchar(20),
	CondPag varchar(10),
	PrazoEntrega varchar(10)
);



	

create table Produtos (
	Cod int not null primary key auto_increment,
	NomeProd varchar(10),
	CodProd int,
	Descricao varchar(20),
	preco decimal(10,2),
	QuantEstoque int,
	Categoria varchar(20),
	DataValidade date,
	Fornecedor varchar(20),
	LocEstoque varchar(10)
);



create table Alunos(
	Cod int not null primary key auto_increment,
	NomeCompleto varchar(30),
	cpf varchar(11),
	Endereco varchar(30),
	Telefone varchar(11),
	Email varchar(20),
	DataNasc date,
	SerieAno varchar(5),
	NomeResp varchar(30),
	EscolaOrigem varchar(20)
);



create table Veiculos(
	Cod int not null primary key auto_increment,
	Placa varchar(8),
	Marca varchar(10),
	Modelo varchar(10),
	AnoFab int,
	Cor varchar(10),
	TpCmbstv varchar(15),
	NumChassi int,
	Quilometragem varchar(200),
	DtUltmRev date
);



create table Eventos(
	Cod int not null primary key auto_increment,
	Nome varchar(20),
	DataEvento date,
	HorarioInicio varchar(6),
	HorarioTermino varchar(6),
	Local varchar(20),
	Descricao varchar(30),
	PublicoAlvo varchar(20),
	CapacidadeMax int,
	Organizador varchar(30)
);


create table Contas(
	Cod int not null primary key auto_increment,
	DescricaoConta varchar(20),
	Valor decimal(10,2),
	DataVenc date,
	DataPag date,
	Fornecedor varchar(20),
	Categoria varchar(10),
	StatusPag varchar(10),
	MetPag varchar(15),
	Observacoes varchar(30)
);


CREATE TABLE Livros (
    Cod int not null primary key auto_increment,
    Titulo varchar(100),
    Autor varchar(100),
    ISBN varchar(20),  
    Editora varchar(100),
    AnoPub int,
    Genero varchar(50),
    NumPag int,
    Idioma varchar(50),
    LocBiblioteca varchar(100)  
);

create table login(
	CodLogin int not null primary key auto_increment,
	Usuario varchar(50) not null,
	Senha varchar(15) not null,
	Status varchar(20) not null
);
