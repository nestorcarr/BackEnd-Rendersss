FROM amazoncorretto:11-alpine-jdk
MAINTAINER nestorcarr
COPY target/argPrograma-0.0.1.jar argPrograma-app.jar
ENTRYPOINT ["java","-jar","/argPrograma-app.jar"]
