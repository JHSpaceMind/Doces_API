![Finalizado](https://img.shields.io/badge/Status-Finalizado-brightgreen)
# API de Doces 🍬

Uma API RESTful para gerenciar um catálogo de doces, permitindo operações de CRUD (Criar, Ler, Atualizar, Excluir) nos itens.

## Funcionalidades

### 1. Obter Todos os Doces
- **Método**: `GET /doces`
- **Descrição**: Retorna uma lista de todos os doces cadastrados na loja.

### 2. Obter Doce por ID
- **Método**: `GET /doces/{id}`
- **Descrição**: Retorna os detalhes de um doce específico pelo seu ID. Retorna um erro 404 se o doce não for encontrado.

### 3. Cadastrar Doce
- **Método**: `POST /doces`
- **Descrição**: Adiciona um novo doce ao catálogo. Retorna um status 201 se o doce for criado com sucesso.

### 4. Excluir Doce
- **Método**: `DELETE /doces/{id}`
- **Descrição**: Remove um doce do catálogo pelo seu ID. Retorna um status 204 se excluído com sucesso, ou um erro 404 se o doce não for encontrado.

### 5. Atualizar Doce
- **Método**: `PUT /doces/{id}`
- **Descrição**: Atualiza os dados de um doce existente. Retorna um status 200 se atualizado com sucesso, ou um erro 404 se o doce não for encontrado.

## Tecnologias Utilizadas 🛠️
- ![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
- ![JPA](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
- ![Banco de Dados](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

## Como Usar
1. Clone o repositório.
2. Configure o banco de dados no arquivo de propriedades.
3. Execute a aplicação.
4. Use um cliente HTTP como Postman ou Insomnia para interagir com a API.

## Contribuição 🤝
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
