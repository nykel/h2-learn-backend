package br.com.nykel.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository repository;

    @Autowired
    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<CountryDM> findAll() {
        return (List<CountryDM>) repository.findAll();
    }
}
