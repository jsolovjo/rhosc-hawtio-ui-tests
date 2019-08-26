# rhosc-hawtio-ui-tests
This repository is created specifically for Red Hat Open Source Contest (RHOSC). It contains automated UI tests for [HawtIO](https://hawt.io/) project.

## Prerequisite
### Required basic skills
- Java
- Maven
- HTML, CSS, XPath

### Good to know 
- Cucumber framework
- Selenium and Selenide frameworks

## The main goals of this project are:
- Review what already is implemented and if it is needed - refactor\fix\remove
- Come up with new test scenarios\cases\strategies
- Develop automated UI tests based on test scenarios\cases
- Make issue reports if some bugs were found while developing new tests

## Getting started
### Test suite setup
1. Make sure you have Java, Maven and Git installed and configured in your machine

2. Clone this repository
    ```
    git clone https://github.com/jsolovjo/rhosc-hawtio-ui-tests.git
    ```
3. Create a new branch from master

4. Develop new UI tests - enjoy and have a fun!

### Test application setup and run
1. Clone HawtIO project
    ```
    git clone https://github.com/hawtio/hawtio.git
    ```
    
2. Go to `.../hawtio/` and build the project with command `mvn clean install`    

3. Go to `.../hawtio/examples/springboot-authentication/`

4. Open and edit `pom.xml` and add the following dependency:
    ```
    <dependency>
        <groupId>org.apache.camel</groupId>
        <artifactId>camel-spring-boot-starter</artifactId>
        <version>2.17.0</version> <!-- use the same version as your Camel core version -->
    </dependency>
    ```
    
5. Go to `.../hawtio/examples/springboot-authentication/src/main/java/io/hawt/example/spring` and add a new Java class with the following content:
    ```
    package com.example;

    import org.apache.camel.builder.RouteBuilder;
    import org.springframework.stereotype.Component;

    @Component
    public class MyRoute extends RouteBuilder {

        @Override
        public void configure() throws Exception {
            from("timer:foo").to("log:bar");
        }
    }
    ```
    
6. Go to `.../hawtio/examples/springboot-authentication/` and run the command: `mvn spring-boot:run`

7. Open `http://localhost:10001/actuator/hawtio/` in your web browser

8. Login credentials:
Username: `hawtio`
Password: `hawtio`

## Source links
### HawtIO project
[https://github.com/hawtio/hawtio](https://github.com/hawtio/hawtio)

### Camel Spring Boot starter
[https://camel.apache.org/components/latest/spring-boot.html#SpringBoot-CamelSpringBootStarter](https://camel.apache.org/components/latest/spring-boot.html#SpringBoot-CamelSpringBootStarter)
