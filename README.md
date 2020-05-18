# Spring 2.3 Example

## Build docker image

```
cd orderservice
./mvnw clean spring-boot:build-image
```

## Run

```
docker run -p 8700:8700 orderservice:0.0.1-SNAPSHOT
```

## View Git Commit Info

Open `http://localhost:8700/actuator/info`

## View scheduled tasks

Open `http://localhost:8700/actuator/scheduledtasks`

## View "environment" (properties etc)


Open `http://localhost:8700/actuator/env`


