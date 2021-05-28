package com.milena.validdemo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class Address {

    @NotEmpty
    private String street;

    @NotEmpty
    private String city;

    @Size(min = 4, max = 6)
    private String postcode;
}
