package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private final static Logger log = LoggerFactory.getLogger(Service.class);

    @Autowired
    private Id id;
    @Autowired
    private ObjectMapper objectMapper;

    public void printId() throws JsonProcessingException {
        // fails
        log.info(objectMapper.writeValueAsString(id));
    }
}
