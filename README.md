# rhosc-hawtio-ui-tests
This repository is created specifically for Red Hat Open Source Contest (RHOSC). It contains automated UI tests for [HawtIO](https://hawt.io/) project.  

The current test suite has limited functionality and it is cropped version of real life project.  

Designed specifically for Red Hat Open Source Contest purpose.

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

5. Command to run tests
   ```
   mvn clean install -Dhawtio -Dhawtio.spring-boot -Dbrowser=chrome
   ```

## Test application setup and run
### HawtIO on Spring Boot 1
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
    
5. Go to `.../hawtio/examples/springboot-authentication/src/main/java/io/hawt/example/spring/boot` and add a new Java class with the following content:
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

### HawtIO in Karaf
1. Download [Karaf Runtime Binary Distribution](https://karaf.apache.org/download.html)

2. Follow the steps from the [docs](https://karaf.apache.org/get-started.html) how to get started with Karaf

3. Deploy HawtIo on Karaf following the steps from [here](https://hawt.io/docs/get-started/#deploying-on-apache-karaf)

4. Run the quickstarts following the steps from [here](https://blog.stackleader.com/camel/2016/05/02/deploy-apache-camel-quickstart-karaf.html)

5. Open `http://localhost:8181/hawtio/` in your web browser

6. Login credentials:  
Username: `karaf`  
Password: `karaf`

## Source links
### HawtIO project
[https://github.com/hawtio/hawtio](https://github.com/hawtio/hawtio)

### Camel Spring Boot starter
[https://camel.apache.org/components/latest/spring-boot.html#SpringBoot-CamelSpringBootStarter](https://camel.apache.org/components/latest/spring-boot.html#SpringBoot-CamelSpringBootStarter)

### Apache Karaf
[https://karaf.apache.org/](https://karaf.apache.org/)

### Apache Camel Quickstarts
[https://blog.stackleader.com/camel/2016/05/02/deploy-apache-camel-quickstart-karaf.html](https://blog.stackleader.com/camel/2016/05/02/deploy-apache-camel-quickstart-karaf.html)
