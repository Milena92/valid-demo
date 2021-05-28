package com.milena.validdemo;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    List<User> findAllByPostcode(String postcode);
}
