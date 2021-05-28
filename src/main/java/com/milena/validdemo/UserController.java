package com.milena.validdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
//@Validated
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@Validated(CreateUser.class)
                                           @RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@Validated(UpdateUser.class)
                                           @RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @GetMapping("/{postcode}")
    public ResponseEntity<List<User>> findAllByPostcode(@Size(min = 4, max = 6)
                                                        @PathVariable String postcode) {
        return ResponseEntity.ok(userService.findAllByPostcode(postcode));
    }
}
