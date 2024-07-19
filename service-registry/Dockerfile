FROM openjdk:24-slim
WORKDIR /app
COPY target/*.jar /app/discovery.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "discovery.jar"]