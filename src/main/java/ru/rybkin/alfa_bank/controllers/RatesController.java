package ru.rybkin.alfa_bank.controllers;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.rybkin.alfa_bank.services.RatesService;

@RestController
@RequestMapping(value = "rates")
public class RatesController {

    private final RatesService ratesService;

    public RatesController(RatesService ratesService) {
        this.ratesService = ratesService;
    }

    @GetMapping("check")
    public ResponseEntity<ByteArrayResource> getReviseOfRates(@RequestParam String rate) {
        return ratesService.changeOfRate(rate);
    }


}
