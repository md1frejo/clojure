FROM openjdk:8-alpine

COPY target/uberjar/test.jar /test/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/test/app.jar"]
