FROM openjdk:24-slim
WORKDIR /app
COPY target/*.jar /app/ms-product.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "ms-product.jar"]