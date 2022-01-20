package za.co.currency.project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import za.co.currency.project.model.response.currencyData;
import za.co.currency.project.model.response.currencyResponse;

@Service
public class CurrencyServiceImp implements CurrencyService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyServiceImp.class);

    @Value("${currency.api.url}")
    private String currencyApiUrl;

    RestTemplate restTemplate;

    public CurrencyServiceImp() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public currencyData fetchCurrencies(){

        LOGGER.info("Start fetch currency data");

        try
        {

            // get api url and make the api call
            ResponseEntity<currencyResponse> response = restTemplate.getForEntity(currencyApiUrl, currencyResponse.class);

            // handle the respose

            if(response.getStatusCode().is2xxSuccessful() && response.getBody().getData() != null) {

                return response.getBody().getData();
            }else
            {
                LOGGER.error("Could not retrieve data from the API");
            }

        }catch(Exception e) {
            LOGGER.error(e.getLocalizedMessage());
        }

        return null;
    }
}
