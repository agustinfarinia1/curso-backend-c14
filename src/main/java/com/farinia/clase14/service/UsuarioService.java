package com.farinia.clase14.service;

import com.farinia.clase14.builder.UserBuilder;
import com.farinia.clase14.model.UserDocument;
import com.farinia.clase14.model.UserFactory;
import com.farinia.clase14.model.UserRequest;
import com.farinia.clase14.model.UserResponse;
import com.farinia.clase14.repository.UsuarioRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioServiceInterface{

    private final UsuarioRepositoryMongo repository;
    private final UserFactory userFactory = new UserFactory();
    @Override
    public UserResponse create(UserRequest request) {
        var entity = userFactory.createUser(request);
        var entitySaved = repository.save(entity);
        return UserBuilder.entityToResponseCreate(entitySaved);
    }

    @Override
    public UserResponse update(String id, UserRequest request) {
        var entity = userFactory.createUser(request);
        entity.setId(id);
        entity.setUpdateDate(LocalDateTime.now().toString());
        var entitySaved = repository.save(entity);
        return UserBuilder.entityToResponseCreate(entitySaved);
    }

    @Override
    public List<UserResponse> searchAll() {
        return UserBuilder.listEntityToResponse(repository.findAll());
    }
}
