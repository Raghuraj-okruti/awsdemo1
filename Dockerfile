FROM openjdk:8
EXPOSE:8080
ADD target/awsdemo1.jar awsdemo1.jar
ENTRYPOINT ["java","-jar","/awsdemo1.jar"]