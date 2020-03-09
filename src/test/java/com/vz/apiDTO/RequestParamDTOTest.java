package com.vz.apiDTO;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RequestParamDTOTest {
    @Value("${apiKeyParam}")
    private String API_KEY;

    @Autowired
    private RequestParamDTO requestParamDTO;

    @Test
    public void contextLoads() throws Exception {
        assertNotNull(API_KEY);
        assertNotNull(requestParamDTO);
    }

    @Test
    public void testRequestLineForTopHeadlinesNews(){
        String expectedString = "https://newsapi.org/v2/top-headlines?country=us&apiKey=" + API_KEY;
        assertEquals(expectedString, requestParamDTO.getRequestLineForTopHeadlinesNews());
    }
}
