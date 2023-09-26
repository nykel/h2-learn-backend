package br.com.nykel.h2;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<CountryDM,Long> {
}
