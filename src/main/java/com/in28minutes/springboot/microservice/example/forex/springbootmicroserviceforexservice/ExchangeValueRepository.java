package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository <-- Object marshalling --> Database
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);

}


