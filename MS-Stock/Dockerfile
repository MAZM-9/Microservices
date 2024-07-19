FROM openjdk:24-slim
WORKDIR /app
COPY target/*.jar /app/ms-stock.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "ms-stock.jar"]