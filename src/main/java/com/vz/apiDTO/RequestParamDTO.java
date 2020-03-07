package com.vz.apiDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import static com.vz.apiDTO.ConstantsHttp.*;

@Component
public class RequestParamDTO {
    @Value("${apiUrl}")
    private String baseApiUrl;
    @Value("${endpoint}")
    private String endpoint;
    @Value("${countryParam}")
    private String countryParam;
    @Value("${apiKeyParam}")
    private String apiKeyParam;
    StringBuilder line;

    public String getRequestLine(){
        line = new StringBuilder(baseApiUrl);
        return line.append(endpoint).append(country).append(countryParam).append('&').
                append(apiKey).append(apiKeyParam).toString();
    }

}
