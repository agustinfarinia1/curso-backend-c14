package com.farinia.clase14.repository;

import com.farinia.clase14.model.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositoryMongo extends MongoRepository<UserDocument, String> {
    void delete(Optional<UserDocument> byId);
}
