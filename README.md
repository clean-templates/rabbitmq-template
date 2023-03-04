# Basic Demo
The following repository will showcase an example of how you create a queue, binding and routing key dynamically as code using Spring Boot and RabbitMQ using Maven.
The application has a simple use case where you publish a message on application run time and then receive the message using a Rabbit listener.
The repository also demonstrates how to organize your packages following Clean Architecture.

# Technologies Used
This project uses the following technologies:
- Spring Boot
- RabbitMQ
- Maven

# Getting Started
To run this project locally, follow these steps:

1. Clone this repository
```
git clone https://github.com/clean-templates/rabbitmq-template.git
```

2. Run RabbitMq in container
```
docker-compose up
```

3. Build the project using Maven:

```
mvn clean install
```


4. Start the application:
```
mvn spring-boot:run
```

# Clean Architecture
The project follows the principles of Clean Architecture, which is an architectural pattern that emphasizes the separation of concerns between different layers of the application. In this architecture, the business logic is placed at the center, surrounded by layers of adapters that connect the application to external systems.
The package structure of the project reflects this architecture, with separate packages for each layer:
s well as a clear separation of concerns between different parts of the application.