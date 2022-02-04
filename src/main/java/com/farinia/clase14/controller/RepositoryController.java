package com.farinia.clase14.controller;

import com.farinia.clase14.model.UserRequest;
import com.farinia.clase14.model.UserResponse;
import com.farinia.clase14.service.UsuarioServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/factory")
public class RepositoryController {

    private final UsuarioServiceInterface service;

    @PostMapping("/user")
    public UserResponse createUser(
            @Validated @RequestBody UserRequest user) {
        return service.create(user);
    }

    @PutMapping("/user/{id}")
    public UserResponse updateProduct(@PathVariable String id,
                                         @Validated @RequestBody UserRequest user) {
        return service.update(id, user);
    }

    @GetMapping("/user/all")
    public List<UserResponse> searchUser() {
        return service.searchAll();
    }
}
