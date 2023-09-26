package br.com.nykel.h2;

import jakarta.persistence.*;


@Entity
@Table(name = "country")
public class CountryDM {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

}
