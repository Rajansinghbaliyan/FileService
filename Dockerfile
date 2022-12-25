FROM amazoncorretto:17-alpine

WORKDIR /usr/local/bin/app

COPY target/FileService-1.0-SNAPSHOT-jar-with-dependencies.jar ROOT.jar

CMD ["java", "-jar", "ROOT.jar"]
