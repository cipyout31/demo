FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
COPY . .
ENTRYPOINT ["java", "-jar", "app.jar"]