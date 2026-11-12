FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /build
COPY pom.xml ./
COPY src ./src
RUN mvn --batch-mode --no-transfer-progress verify

FROM gcr.io/distroless/java21-debian13:nonroot
WORKDIR /app
COPY --from=build /build/target/sistema-financeiro.jar /app/sistema-financeiro.jar
ENTRYPOINT ["java", "-jar", "/app/sistema-financeiro.jar"]
