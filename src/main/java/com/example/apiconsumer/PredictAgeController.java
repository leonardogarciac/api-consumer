package com.example.apiconsumer;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class PredictAgeController {

    @GetMapping(value = "/predict-age")
    public Person predictAge(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "name is mandatory");
        }
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.agify.io/?name=" + name, Person.class);
    }

}
