# Spring Boot MongoDB API

Esta aplicação Spring Boot fornece uma API REST para realizar operações de inserção e listagem 
de documentos na coleção "shows" do MongoDB.


## Configuração do Projeto

MongoClient mongoCliente(): Cria e retorna um objeto do tipo MongoClient, utilizado para se conectar ao MongoDB.

MongoClients.create(): O método create() cria uma nova instância de MongoClient usando a URL de conexão fornecida.

URL de conexão: A URL "mongodb+srv://root:root@cluster0.9ir0p.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0" 
é usada para se conectar a um cluster MongoDB hospedado na nuvem (MongoDB Atlas).

MongoTemplate mongoTemplate(MongoClient mongoCliente): Método que cria e retorna um objeto MongoTemplate, que faz parte do 
Spring Data MongoDB. Ela fornece operações básicas de CRUD para interagir com o MongoDB.

Nas dependencies do projeto, fiz uso do Lombok para tornar o código mais limpo e organizado. E na properties foi incluída 
a database e a URL de conexão com o MongoDB Atlas.


## Executando a Aplicação

O fluxo de execução começa pela classe principal com o método main, que inicializa o Spring.
O ShowController é configurado para responder a requisições HTTP. O MongoDB é configurado por meio da classe ConfigurationMongo,
e o MongoTemplate é usado para todas as operações de banco de dados através do repositório.

Essa arquitetura baseada em anotações permite que o Spring Boot lide com a maioria das configurações
de forma automática, facilitando o desenvolvimento.

