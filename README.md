## Build and run application
`./gradlew build && java -jar build/libs/kotlin-spring-basic-0.0.1-SNAPSHOT.jar`

## Build docker image and run application

```
docker build --build-arg JAR_FILE=build/libs/\*.jar -t kotlin-spring-boot-docker .
docker run -p 8080:8080 kotlin-spring-boot-docker
```