FROM openjdk:17
ARG JAR_FILE=./target7*.jar
COPY ${JAR_FILE} feeMS.jar
ENTRYPOINT ["java", "-jar", "/feeMS.jar"]