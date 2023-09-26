package br.com.nykel.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/country")
public class CountryResource {

    private final CountryService service;

    @Autowired
    public CountryResource(CountryService service) {
        this.service = service;
    }

    @GetMapping
    public List<CountryDM> findAll() {
        return service.findAll();
    }
}
