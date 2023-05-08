FROM amazoncorretto:20-alpine-jdk

MAINTAINER Adriana

COPY target/base-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080