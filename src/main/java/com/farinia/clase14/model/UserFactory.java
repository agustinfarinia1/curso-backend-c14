package com.farinia.clase14.model;

import com.farinia.clase14.builder.UserBuilder;

public class UserFactory {

    public UserDocument createUser(UserRequest request) {
        switch (request.getTipo()) {
            case "admin":
                return UserBuilder.requestToEntityAdmin(request);
            case "editor":
                return UserBuilder.requestToEntityEditor(request);
            case "client":
                return UserBuilder.requestToEntityClient(request);
            default:
                return null;
        }
    }
}
