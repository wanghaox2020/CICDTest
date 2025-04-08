FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/cicd-github-0.0.1-SNAPSHOT.jar cicd-github-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-integration-demo.jar"]