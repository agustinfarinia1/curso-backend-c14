package com.farinia.clase14.service;

import com.farinia.clase14.model.UserRequest;
import com.farinia.clase14.model.UserResponse;

import java.util.List;

public interface UsuarioServiceInterface {
    UserResponse create(UserRequest request);
    UserResponse update(String id, UserRequest request);
    List<UserResponse> searchAll();
}
