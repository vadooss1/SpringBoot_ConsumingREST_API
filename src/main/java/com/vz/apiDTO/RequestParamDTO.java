package com.vz.apiDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import static com.vz.apiDTO.ConstantsHttp.*;

@Component
public class RequestParamDTO {
    @Value("${apiUrl}")
    private String baseApiUrl;
    @Value("${endpointTopHeadlines}")
    private String endpointTopHeadlines;
    @Value("${endpointEverything}")
    private String endpointEverything;
    @Value("${endpointSources}")
    private String endpointSources;
    @Value("${countryParam}")
    private String countryParam;
    @Value("${apiKeyParam}")
    private String apiKeyParam;
    private StringBuilder line;

    public String getRequestLineForTopHeadlinesNews(){
        line = new StringBuilder(baseApiUrl);
        return line.append(endpointTopHeadlines).append(country).append(countryParam).append(AND).
                append(apiKey).append(apiKeyParam).toString();
    }

}
