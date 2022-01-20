package za.co.currency.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import za.co.currency.project.model.response.currencyData;
import za.co.currency.project.service.CurrencyService;

@Controller
public class CurrenyController {
    
    @Autowired
    private CurrencyService service;

    @GetMapping(value = "")
    public ModelAndView index() {

        currencyData data = service.fetchCurrencies();


        System.out.println("ZAR: "+data.zAR);

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("Currencies", data);
        return modelAndView;
    }

    @GetMapping(value = "test")
    public ResponseEntity test() {

        return new ResponseEntity<>(service.fetchCurrencies(), HttpStatus.OK);
    }
}
