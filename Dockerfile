#
# Build stage
#

FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#

FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/restful-app-with-static-data-1.0.1.jar /tmp/restful-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-cp", "/tmp/restful-app.jar", "-Dspring.profiles.active=development", "org.springframework.boot.loader.JarLauncher"]
