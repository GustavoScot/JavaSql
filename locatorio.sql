CREATE DATABASE lojaLocacao;

USE lojaLocacao; 

CREATE TABLE demo (ID integer primary key, Name varchar(20), Hint text );
CREATE TABLE Devolucao (
    ID_Devolucao INT PRIMARY KEY AUTO_INCREMENT,
    ID_Locacao INT,
    Data_Devolucao DATE,
    Quilometragem INT,
    Condicao_Veiculo VARCHAR(50),
    Multa FLOAT,
    FOREIGN KEY (ID_Locacao) REFERENCES Locacao(ID_Locacao)
);
CREATE TABLE Funcionario (
    ID_Funcionario INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100),
    CPF VARCHAR(11) UNIQUE,
    Cargo VARCHAR(50),
    Telefone VARCHAR(15),
    Email VARCHAR(100)
);
CREATE TABLE Locacao (
    ID_Locacao INT PRIMARY KEY AUTO_INCREMENT,
    Data_Inicio DATE,
    Data_Fim DATE,
    ID_Veiculo INT,
    ID_Locatorio INT,
    ID_Funcionario INT,
    Status VARCHAR(20),
    FOREIGN KEY (ID_Veiculo) REFERENCES Veiculo(ID_Veiculo),
    FOREIGN KEY (ID_Locatorio) REFERENCES Locatorio(ID_Locatorio),
    FOREIGN KEY (ID_Funcionario) REFERENCES Funcionario(ID_Funcionario)
);
CREATE TABLE Locatorio(
    ID_Locatorio INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100),
    CPF VARCHAR(11) UNIQUE,
    Telefone VARCHAR(15),
    Endereco VARCHAR(255),
    Data_Nascimento DATE,
    Email VARCHAR(100)
);
CREATE TABLE Pagamento (
    ID_Pagamento INT PRIMARY KEY AUTO_INCREMENT,
    ID_Locacao INT,
    Valor FLOAT,
    Data_Pagamento DATE,
    Metodo VARCHAR(50),
    Status VARCHAR(20),
    FOREIGN KEY (ID_Locacao) REFERENCES Locacao(ID_Locacao)
);
CREATE TABLE Veiculo (
    ID_Veiculo INT PRIMARY KEY AUTO_INCREMENT,
    Marca VARCHAR(50),
    Modelo VARCHAR(50),
    Ano INT,
    Placa VARCHAR(10) UNIQUE,
    Status VARCHAR(20),
    Preco_Diario FLOAT
);

 
