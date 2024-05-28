# Calculador_Nextar

Calculador_Nextar é um projeto Spring Boot que implementa uma calculadora REST para realizar cálculos com base em expressões matemáticas fornecidas via API. O projeto armazena as expressões e os resultados em um banco de dados H2 e reutiliza resultados já calculados para melhorar a eficiência.

## Funcionalidades

- Avaliação de expressões matemáticas
- Armazenamento de expressões e resultados no banco de dados H2
- Reutilização de resultados já calculados
- Documentação da API com Swagger

## Requisitos

- Java 17 ou superior
- Maven

## Configuração

### Clonando o repositório

```bash
git clone https://github.com/seu-usuario/Calculador_Nextar.git
cd Calculador_Nextar


# Documentação da API
http://localhost:8080/swagger-ui.html


# Banco de Dados
http://localhost:8080/h2-console

# Credenciais de Acesso ao H2
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (em branco)


