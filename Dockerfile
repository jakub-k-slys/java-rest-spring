FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /app
COPY . .
RUN ./gradlew bootJar

FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /app/rest-app/build/libs/rest-app-*.jar rest-app.jar
ENTRYPOINT ["java","-jar","rest-app.jar"]
