FROM openjdk:11
COPY ./Scientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
