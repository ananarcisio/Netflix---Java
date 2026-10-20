# 🎬 Netflix Clone - Java Spring Boot

Um clone moderno da interface da Netflix desenvolvido em **Java 17** com **Spring Boot 3**, utilizando **Spring Data JPA**, **H2 Database** e **Thymeleaf**. O projeto demonstra a criação de uma aplicação web completa (Full-Stack SSR) com persistência de dados e estilização inspirada no serviço de streaming oficial.

---

## 📸 Demonstração da Aplicação

![Netflix Clone Banner](https://raw.githubusercontent.com/ananarcisio/Netflix---Java/main/screenshots/preview.png)

> **Nota:** Adicione a sua captura de ecrã na pasta `screenshots/preview.png` do repositório para que a imagem apareça aqui automaticamente.

---

## 🚀 Tecnologias e Ferramentas Utilizadas

- **Linguagem:** Java 17
- **Framework Principal:** Spring Boot 3.1.x
- **Persistência de Dados:** Spring Data JPA / Hibernate
- **Banco de Dados:** H2 Database (In-Memory)
- **Template Engine:** Thymeleaf
- **Front-end:** HTML5, CSS3, FontAwesome (ícones)
- **Gerenciador de Dependências:** Apache Maven

---

## 🛠️ Arquitetura e Estrutura do Projeto

A aplicação segue o padrão arquitetural MVC (Model-View-Controller) com divisão clara de responsabilidades:

```text
src/main/java/com/ananarcisio/netflix/
├── controller/
│   └── HomeController.java      # Gerencia as rotas e renderização das views
├── model/
│   └── Movie.java               # Entidade JPA que representa os filmes/séries
├── repository/
│   └── MovieRepository.java     # Interface JPA para operações CRUD no banco H2
└── NetflixApplication.java      # Classe principal de inicialização do Spring
```

---

## ⚡ Como Executar o Projeto Localmente

### 1. Pré-requisitos
Certifique-se de ter instalado na sua máquina:
- **JDK 17** ou superior
- **Git**

### 2. Clonar o Repositório
```bash
git clone https://github.com/ananarcisio/Netflix---Java.git
cd Netflix---Java
```

### 3. Executar a Aplicação
Utilize o Maven Wrapper incluído no projeto:

- **Windows (PowerShell/CMD):**
  ```powershell
  .\mvnw spring-boot:run
  ```

- **Linux / macOS:**
  ```bash
  ./mvnw spring-boot:run
  ```

### 4. Acessar a Aplicação no Navegador
Após o início do servidor Tomcat (exibido no terminal):
- 🌐 **Aplicação Web:** [http://localhost:8081](http://localhost:8081)
- 🗄️ **Console do Banco H2:** [http://localhost:8081/h2-console](http://localhost:8081/h2-console)
  - **JDBC URL:** `jdbc:h2:mem:netflixdb`
  - **User Name:** `sa`
  - **Password:** *(deixe em branco)*

---

## ⚙️ Configurações (`application.properties`)

```properties
server.port=8081
spring.application.name=netflix

# Configurações do Banco H2
spring.datasource.url=jdbc:h2:mem:netflixdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

# Inicialização e DDL
spring.jpa.defer-datasource-initialization=true
spring.sql.init.mode=always
spring.jpa.hibernate.ddl-auto=update
```

---

## 👩‍💻 Autora

Desenvolvido por **Ana Narcisio**.

- 🐙 **GitHub:** [@ananarcisio](https://github.com/ananarcisio)
- 💼 **Repositório:** [Netflix---Java](https://github.com/ananarcisio/Netflix---Java)
