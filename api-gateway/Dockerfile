FROM openjdk:24-slim
WORKDIR /app
COPY target/*.jar /app/gateway.jar

EXPOSE 8282

ENTRYPOINT ["java", "-jar", "gateway.jar"]