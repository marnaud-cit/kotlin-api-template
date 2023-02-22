# Kotlin API Template

O sistema **OMS Industry Stock SAP Integrator** do IMS é responsável por integrar as informações de estoques da indústria do Grupo Boticário.<br>
Atualmente, essas atualizações são provenientes do SAP ECC e SAP S4/HANA.

## Objetivo

Esse template foi desenvolvido com o objetivo de permitir o treinamento de criações de api com spring boot + kotlin,nele ja
se encontra configurada a parte de conexão em banco , criação de migrations e todo as libs necessarias para o desenvolvimento de apis.

## Setup

### Requisitos
- [OpenJDK 17 Amazon Corretto](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html)
- [Docker](https://docs.docker.com/get-docker/)
- [Docker Compose](https://docs.docker.com/compose/install/)
- [Gradle](https://gradle.org/install/) (não é necessário instalar)
- [DBeaver](https://dbeaver.com/download/) ou [pgAdmin](https://www.pgadmin.org/download/)
- [Intellij IDEA Community](https://www.jetbrains.com/pt-br/idea/download/#section=linux) (não obrigatório, mas recomendado)

### Ambiente de Desenvolvimento

1. Clonar o repositório:
    ``` sh
    git clone git@github.com:grupoboticario/demaba-oms-ims-industry-stock-sap-integrator.git
    ```

2. Navegue até o diretório da aplicação
    ``` sh
    cd {path-do-projeto-clonado}/app
    ```
3. Execute o docker
    * Navegue até o diretório do docker:
        ``` sh
        cd {path-do-projeto-clonado}/docker
        ```
    * Execute o docker-compose up:
        ``` sh
        docker-compose -f docker-compose-dev.yml up -d
        ```
      _OBS: O docker-compose é responsável por criar/inicializar os serviços do Postgres, AWS, RabbitMQ, Zookeeper e schemaregistry_.

### Testes


### Inicializar o projeto

4. Execute o comando para inicializar o projeto:
    ``` sh
    ./gradlew bootRun
    ```