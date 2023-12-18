FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/ServiceB-0.0.1-SNAPSHOT.jar serviceb.jar
EXPOSE 8080
CMD ["java", "-jar", "serviceb.jar"]
