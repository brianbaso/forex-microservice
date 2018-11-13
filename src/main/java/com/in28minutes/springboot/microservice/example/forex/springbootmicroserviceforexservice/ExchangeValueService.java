package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class ExchangeValueService {

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @Autowired
    private ExchangeBean exchangeBean;

    public Optional<ExchangeValue> getExamples() {
        return this.exchangeValueRepository.findById(1L);
    }

    @PostConstruct
    public void postConstruct() {
        ExchangeBean myExchangeBean = this.exchangeBean;
    }
}
