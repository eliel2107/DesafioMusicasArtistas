# Desafio de Músicas e Artistas

Este projeto é uma aplicação de console desenvolvida em Java com Spring Boot, projetada para gerenciar um banco de dados de artistas e suas músicas. A aplicação permite cadastrar artistas e suas respectivas músicas, além de listar as músicas por artista e buscar artistas por trechos do nome.

## ✨ Funcionalidades Principais

- **Cadastrar Artistas:** Permite adicionar novos artistas ao banco de dados, classificando-os por tipo (solo, dupla ou banda).
- **Cadastrar Músicas:** Permite adicionar novas músicas e associá-las a um artista já existente.
- **Listar Músicas por Artista:** Exibe todas as músicas de um artista específico.
- **Pesquisar Artista:** Busca por artistas cujo nome contenha um determinado trecho.
- **Integração com ChatGPT (Opcional):** O projeto inclui uma classe para consultar a API do ChatGPT para obter informações adicionais sobre os artistas.

## 🚀 Tecnologias Utilizadas

- **Java 17:** Versão da linguagem Java utilizada no projeto.
- **Spring Boot:** Framework principal para a criação da aplicação.
  - **Spring Data JPA:** Para persistência de dados e comunicação com o banco de dados.
  - **Spring Boot DevTools:** Para facilitar o desenvolvimento com live reload.
- **PostgreSQL:** Sistema de gerenciamento de banco de dados relacional utilizado para armazenar os dados.
- **Hibernate:** Framework de mapeamento objeto-relacional (ORM) usado pelo Spring Data JPA.
- **Maven:** Ferramenta de gerenciamento de dependências e build do projeto.

## ⚙️ Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:
- [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) ou superior.
- [Maven](https://maven.apache.org/download.cgi) 3.8 ou superior.
- [PostgreSQL](https://www.postgresql.org/download/) 14 ou superior.
- Uma IDE de sua preferência, como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [VS Code](https://code.visualstudio.com/).

## 🔧 Configuração do Ambiente

1.  **Clone o Repositório:**
    ```bash
    git clone https://github.com/eliel2107/DesafioMusicasArtistas.git
    cd DesafioMusicasArtistas
    ```

2.  **Crie o Banco de Dados:**
    - Abra seu cliente PostgreSQL (como pgAdmin ou DBeaver).
    - Crie um novo banco de dados. O nome padrão esperado pela aplicação é `musicas_artistas`.
    ```sql
    CREATE DATABASE musicas_artistas;
    ```

3.  **Configure as Variáveis de Ambiente:**
    A aplicação utiliza variáveis de ambiente para se conectar ao banco de dados. Configure as seguintes variáveis no seu sistema ou na sua IDE:
    - `DB_HOST`: O endereço do seu servidor PostgreSQL (ex: `localhost:5432`).
    - `DB_NAME`: O nome do banco de dados que você criou (ex: `musicas_artistas`).
    - `DB_USER`: Seu nome de usuário do PostgreSQL.
    - `DB_PASSWORD`: Sua senha do PostgreSQL.

    *Dica: No IntelliJ, você pode configurar isso em `Run` -> `Edit Configurations...` -> `Environment variables`.*

## ▶️ Executando a Aplicação

1.  **Instale as Dependências:**
    O Maven cuidará disso automaticamente ao abrir o projeto na sua IDE. Se preferir, pode fazer manualmente pelo terminal:
    ```bash
    mvn clean install
    ```

2.  **Rode a Aplicação:**
    - Execute a classe principal `ArtistasemusicasApplication.java` a partir da sua IDE.
    - A aplicação iniciará no console, exibindo um menu de opções para você interagir.

---

Feito com ❤️ por **Eliel**

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/eliel2107)
