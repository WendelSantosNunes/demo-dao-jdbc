# Projeto Dao

<h4 align="center"> 
	Demonstração do Padrão de projeto Dao
</h4>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-funcionalidades">Funcionalidades</a> •
 <a href="#-Configuração-do-ambiente">Configuração do ambiente</a> • 
 <a href="#-como-executar">Como executar</a> • 
 <a href="#-tecnologias">Tecnologias</a> 
</p>

---

## :ringed_planet: Sobre o projeto

Este projeto é um back-end que tem como objetivo mostrar o padrão de projeto DAO e a utilização do JDBC para o acesso ao banco de dados.

---

## 💻 Funcionalidades
 
- [x] Administrado:
  - [x] Visualizar dados de todos os vendedores da empresa;
  - [x] Visualizar dados de um determinado vendedor;
  - [x] Criar um vendedor em um determinado departamento;
  - [x] Atualizar os dados de um determinado vendedor;
  - [x] Deletar os dados de um determinado vendedor;
  - [x] Criar um departamento;
  - [x] Atualizar os dados de um determinado departamento;
  - [x] Deletar um departamento.

---

## 🎨 Configuração do ambiente

### Linux (Ubuntu)

#### Java 17 

```bash

# Usando o MySQL Workbench, crie uma base de dados chamada "coursejdbc"

# Baixar o MySQL Java Connector

# Caso ainda não exista, criar uma User Library contendo o arquivo .jar do driver do MySQL

## o Window -> Preferences -> Java -> Build path -> User Libraries
## o Dê o nome da User Library de MySQLConnector
## o Add external JARs -> (localize o arquivo jar)

# Criar um novo Java Project

##o Acrescentar a User Library MySQLConnector ao projeto

# Na pasta raiz do projeto, criar um arquivo "db.properties" contendo os dados de conexão:

user=developer
password=1234567
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false

# No pacote "db", criar uma exceção personalizada DbException

# No pacote "db", criar uma classe DB com métodos estáticos auxiliares

## Obter e fechar uma conexão com o banco

---


```

## 🚀 Como executar

### Pré-requisitos

Ter feito a configuração do ambiente.

### Execução

Clicar no arquivo Program.java e depois clicar na opção run

```bash

=== TEST 1: seller findAll ===
Department [id=1, name=Computers]
Department [id=2, name=Game]
Department [id=3, name=Fashion]
Department [id=4, name=Books]
Department [id=5, name=Music]
Department [id=6, name=Music]
Department [id=7, name=Music]

=== TEST 2: seller findById ===
Enter the department id: 6
Department [id=6, name=Music]

=== TEST 3: seller insert ===
9

=== TEST 4: seller update ===
Update completed

=== TEST 5: seller delete ===
Enter id for delete test: 6
Delete completed

```

---

## 🛠 Tecnologias

#### **Back-End**  ([JAVA](https://docs.oracle.com/en/java/))

-   **[Java](/)**
-   **[Eclipse IDE](https://eclipseide.org/)**
-   **[MySQL Workbench](https://www.mysql.com/products/workbench/)**
-   **[MySQL Server](https://dev.mysql.com/downloads/mysql/)**
