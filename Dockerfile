FROM openjdk:8-jdk-alpine
ADD target/hello-service-1.1.jar hello-service.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -jar hello-service.jar
