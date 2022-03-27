# API consumer example with Spring Boot 
Use [agify.io](https://agify.io/) API to predict the age of a parson based on a given name.

###Build it

```
./mvnw clean package
java -jar target java -jar target/api-consumer.jar
```

###Try it

```
curl -v -w "\n" http://localhost:8080/predict-age?name=YourName
```

