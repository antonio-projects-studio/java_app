FROM maven:3.8.6 AS build

WORKDIR /myapp

COPY pom.xml ./
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /myapp

COPY --from=build /myapp/target/myapp-1.0-SNAPSHOT.jar ./myapp.jar

CMD ["java", "-jar", "myapp.jar"]