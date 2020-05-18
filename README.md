# Spring 2.3 Example

## Build docker image

```
cd userservice
./mvnw clean spring-boot:build-image
```

## Run

```
docker run -p 8700:8700 orderservice:0.0.1-SNAPSHOT
```

## View Git Commit Info

Open `http://localhost:8700/actuator/info`

