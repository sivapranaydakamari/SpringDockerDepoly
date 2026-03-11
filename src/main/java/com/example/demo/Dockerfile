FROM eclipse-temurin:17-jdk-apline

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8095

ENTRYPOINT ["java", "-jar", "app.jar"]