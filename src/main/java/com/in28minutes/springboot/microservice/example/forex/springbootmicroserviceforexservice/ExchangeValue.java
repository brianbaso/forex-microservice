package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class ExchangeValue implements Serializable {

    private static final long serialVersionUID = 1L;

    // Id specifies the primary key of an entity
    @Id
    private Long id;

    // Is this similar to field?
    @Column(name="currency_form")
    private String from;

    @Column(name="currency_to")
    private String to;

    private BigDecimal conversionMultiple;
    private int port;

    // Why two different constructors?
    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.setId(id);
        this.setFrom(from);
        this.setTo(to);
        this.setConversionMultiple(conversionMultiple);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
