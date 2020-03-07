package com.vz;

import com.vz.apiDTO.RequestParamDTO;
import com.vz.apiDTO.ResponseObjectDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);
    private int articlesAmount = 5;
    @Autowired
    public RequestParamDTO requestParamDTO;

    public static void main(String[] args) {
        log.info("Application started !");
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            ResponseObjectDTO responseObjectDTO = restTemplate.getForObject(requestParamDTO.getRequestLine(), ResponseObjectDTO.class);
            for (int i = 0; i < articlesAmount; i++) {
                System.out.println(responseObjectDTO);
            }

            log.info("Request finished !");
        };

    }

}
