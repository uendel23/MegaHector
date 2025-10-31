# Etapa 1: Build da aplicação
# Etapa 1: Build da aplicação
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B -DskipTests clean package

# Etapa 2: Execução
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copia o JAR gerado na etapa anterior
COPY --from=builder /app/target/app.jar app.jar

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
