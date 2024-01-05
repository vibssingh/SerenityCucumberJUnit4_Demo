# SerenityCucumberJUnit4_Demo

This is a sample application to demonstrate how to setup and run Serenity, Cucumber tests with JUnit4 in Web application.

1. This framework consists of:
````
Serenity – 4.0.30
Java 17
Junit – 4.13.2
Serenity Cucumber - 4.0.30
Maven Compiler Plugin - 3.12.1
Maven Surefire Plugin - 3.2.3
Maven – 3.9.6
````

2. To run the tests through command line, use the command
````
mvn clean verify
````

3. Reports This framework contains sample Serenity Reports under target/site/serenity folder.

4. To run the tests in chrome, use the below command
````
mvn clean verify -Denvironment=chrome
````

5. To run the tests in firefox, use the below command
````
mvn clean verify -Denvironment=firefox
````

6. To run the tests in edge, use the below command
````
mvn clean verify -Denvironment=edge
````