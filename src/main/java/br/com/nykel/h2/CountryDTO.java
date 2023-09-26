package br.com.nykel.h2;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class CountryDTO {
    private Long id;
    private String name;
}
