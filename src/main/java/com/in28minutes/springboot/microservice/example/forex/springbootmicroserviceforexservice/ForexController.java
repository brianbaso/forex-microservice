package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

    // Return the server port back to understand which instance service is giving the response back. Is eureka used here?
    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    // Create a controller to expose the rest service
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        // Where we get the exchange value from the database
        ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);

        // Get the port from the environment
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }



}
