FROM openjdk:17-jdk-slim

COPY ./build/libs/db-replication-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${SPRING_PROFILE}", "app.jar"]