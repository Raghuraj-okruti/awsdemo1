FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/awsdemo1.jar awsdemo1.jar
COPY ${JAR_FILE} awsdemo1.jar
ENTRYPOINT ["java","-jar","/awsdemo1.jar"]