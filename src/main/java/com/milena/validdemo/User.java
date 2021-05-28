package com.milena.validdemo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
public class User {

    @Id()
    @Null(groups = CreateUser.class)
    @NotNull(groups = UpdateUser.class)
    private String id;

    @NotEmpty
    private String name;

    @NotNull
    @Valid
    private Address address;

}
