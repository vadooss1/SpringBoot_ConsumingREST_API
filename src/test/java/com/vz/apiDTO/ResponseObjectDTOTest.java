package com.vz.apiDTO;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ResponseObjectDTOTest {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RequestParamDTO requestParamDTO;

    @Test
    public void contextLoads() throws Exception {
        assertNotNull(restTemplate);
        assertNotNull(requestParamDTO);
    }

    @Test
    public void checkResponseObject() throws Exception{
        ResponseObjectDTO responseObject = restTemplate.getForObject(requestParamDTO.getRequestLineForTopHeadlinesNews(), ResponseObjectDTO.class);
        assertNotNull(responseObject);
        assertEquals("ok", responseObject.getStatus());
    }

}
