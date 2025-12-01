## Módulo 4.2 PMP

2º Consumer do Módulo 4 do Projeto de PMP para entrega do Projeto Final, nele foi atendido alguns dos seguintes requisitos:

```
Módulo 4 

Crie três aplicações Spring Boot com Kafka:
- 1 produtor
- 2 consumidores

Requisitos:
- Garanta que uma mensagem enviada pelo produtor seja consumida pelas duas aplicações.
- Configure corretamente o Group ID no Kafka.
- Garanta resiliência com três brokers Kafka.
- Configure cinco partições para garantir redundância e melhor paralelismo na leitura das mensagens.

```

### Observação
* **Para utilização integral do 4° módulo, temos esse e outros dois projetos  que contemplam esse desenvolvimento**
* **Esse projeto está em desenvolvimento para integração com outros módulos além dos mencionados. Assim que feitos, serão referenciados nessa descrição...**

| Projeto    | Descrição        | Link do Repositório                                     |
|------------|------------------|---------------------------------------------------------|
| Módulo 4   | Producer Kafka   | [Módulo 4](https://github.com/PMP-Projects/modulo4)     |
| Módulo 4.1 | Consumer 1 Kafka | [Módulo 4.1](https://github.com/PMP-Projects/modulo4.1) |
| Módulo 4.2 | Consumer 2 Kafka | Este Repositório                                        | 

---

````

modulo4-consumer2/
├── 📁 .github
│   └── 📁 workflows
│       └── 📄 ci.yml ← Pipeline de CI (build, testes, validações)
├── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java
│   │   │   └── 📁 modulo4_consumer2 ← Módulo principal do Consumer
│   │   │       ├── 📁 consumer ← Implementações de consumers Kafka
│   │   │       │   └── 📄 PessoaConsumer.java ← Consumer responsável por processar mensagens de Pessoa
│   │   │       ├── 📁 core
│   │   │       │   └── 📁 domain ← Entidades centrais da aplicação
│   │   │       │       └── 📄 Pessoa.java ← Entidade de domínio
│   │   │       ├── 📁 service ← Camada de serviços
│   │   │       │   ├── 📁 impl ← Implementações dos serviços
│   │   │       │   │   └── 📄 PessoaServiceImpl.java ← Regra de negócio para Pessoa
│   │   │       │   └── 📄 PessoaService.java ← Contrato do serviço
│   │   │       ├── 📁 infra
│   │   │       │   ├── 📁 config ← Configurações da aplicação
│   │   │       │   │   └── 📄 KafkaConsumerConfig.java ← Configuração do consumidor Kafka
│   │   │       │   └── 📁 logging ← Configuração de logs da aplicação
│   │   │       │       └── 📄 LoggerFactoryProvider.java
│   │   │       └── 📄 Modulo4Consumer2Application.java ← Classe principal da aplicação
│   │   └── 📁 resources ← Arquivos de configuração (properties e logs)
│   │       ├── 📄 application.properties ← Configurações da aplicação
│   │       └── 📄 logback-spring.xml ← Configuração do Logback
│   ├── 📁 test ← Testes automatizados
├── 📁 target ← Artefatos gerados pelo Maven
├── 📄 .gitattributes
├── 📄 .gitignore
├── 📄 docker-compose.yml ← Subida dos containers (Kafka, Zookeeper, aplicação consumer)
├── 📄 Dockerfile ← Build da imagem Docker da aplicação consumer
├── 📄 HELP.md
├── 📄 mvnw
├── 📄 mvnw.cmd
├── 📄 pom.xml ← Gerenciamento de dependências e build Maven
└── 📄 README.md ← Este arquivo

````
## 🧩 Tecnologias Utilizadas

- **Spring Boot** → Framework Back-End
- **Java** → Linguagem de programação
- **Maven** → Build
- **Docker** → Containers e virtualização
- **MongoDB** → Persistência de dados
- **Graylog** → Central de Logs
- **SonarQube** → Qualidade do Código
- **Github Actions** → CI/CD automatizado

---
## ✅ Qualidade de Código (SonarQube)

> A Qualidade de Código do Projeto é Analisada através do SonarQube, verifique os badges a seguir que apresentam as métricas obtidas no projeto!

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=bugs)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=coverage)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=PMP-Projects_modulo4.2&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=PMP-Projects_modulo4.2)

---

---

## Imagens Docker

- [Módulo 4](https://hub.docker.com/r/juliosn/modulo1)
- [Módulo 4.1](https://hub.docker.com/r/juliosn/modulo2)
- [Módulo 4.2](https://hub.docker.com/r/juliosn/modulo-auth)

---


## 📦 Instalação e Configuração do Ambiente
> Obs.: Tenha as imagens acima baixadas e presentes no seu docker para execução!

### 1️⃣ Clone o projeto na sua máquina e baixe as dependências:
```bash
# Clonar repositório
git clone https://github.com/PMP-Projects/modulo4.2.git

# Acesse a pasta do projeto
cd modulo4.2
````

### 2️⃣ Suba os Containers e Rode a Aplicação
```bash
# Inicie os containers (MongoDB, Redis, OpenSearch, Graylog), juntamente com o Dockerfile da aplicação
docker compose up -d --build
```

#### Serviços do Docker Compose

Caso queira acessar o gerenciamento de logs ou a base de dados do MongoDB, você pode utilizar esses acessos
- MongoDB: localhost:27017
- Graylog: localhost:9000

---
### 🧪 Execução e Testes com Kafka

#### Esta aplicação consome mensagens do tópico Kafka lambda.kafka
> Ao executar a aplicação, você pode enviar mensagens para o tópico Kafka "lambda.kafka"


📦 Exemplo de Payload JSON
```
{
"nome": "Julio",
"dataNascimento": "2000-10-10"
}
```

🔁 Conversão JSON ➜ Hexadecimal

```
Exemplo de Chave: 6b6579

Exemplo de Value (utilizando o payload json acima): 7b226e6f6d65223a224a756c696f222c22646174614e617363696d656e746f223a22323030302d31302d3130227d
```

💻 Endpoints
> Caso queria testar através da imagem do Kafka Producer (modulo 4), utilize o endpoint a seguir (também orientado no repositório do projeto producer)

| Método   | Endpoint                       | Descrição                                                                         |
|----------|--------------------------------|-----------------------------------------------------------------------------------|
| `POST`   | `/modulo-producer/v1/pessoa/save` | Realiza o envio do tópico kafka com o key/value especifico para futura integração |

### Exemplos de uso com cURL

* Obs.: cURLs exportados do Insomnia

#### Fazer envio do Tópico

```bash 
curl --request POST \
  --url http://localhost:8084/modulo-producer/v1/pessoa/save \
  --header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWxpdXNlcyIsImlhdCI6MTc2Mzg1NDExMCwicm9sZXMiOlsiUk9MRV9VU0VSIl19.WUJzlp_OkKp2-uaI-XuRNqS3fIs0L2fHVualEvbTkXA' \
  --header 'Content-Type: application/json' \
  --data '{
  "nome": "Paulo Nivi",
  "dataNascimento": "2000-10-10"
}'
````


📡 Verificando se o consumer recebeu
> Alternativamente, pode ser testado através de aplicações como o Offset Explorer


Ao enviar qualquer uma das mensagens acima, você deverá ver no console da aplicação:

```
[Consumer1] Evento Recebido → ......
```

---

## 📦 Esteira CI/CD com Github Actions

A esteira CI/CD deste projeto é automatizada via Github Actions.

###  Etapas da Esteira:
1️⃣ Verificação de **Vulnerabilidades** com o **Trivy**

2️⃣ Análise de qualidade de código com **Sonar Cloud**

---


## ✍️ Autor do Projeto

<div align="center">

| [<img src="https://avatars.githubusercontent.com/u/99426563" width=115><br><sub>Júlio Neves</sub>](https://github.com/juliosn)
| :---: |

</div>

---