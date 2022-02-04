package com.farinia.clase14.builder;

import com.farinia.clase14.model.UserDocument;
import com.farinia.clase14.model.UserRequest;
import com.farinia.clase14.model.UserResponse;
import com.farinia.clase14.model.concrete.UserAdmin;
import com.farinia.clase14.model.concrete.UserClient;
import com.farinia.clase14.model.concrete.UserEditor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserBuilder {
    public static UserAdmin requestToEntityAdmin(UserRequest request) {
        return UserAdmin.builder()
                .tipo(request.getTipo())
                .nombre(request.getNombre())
                .email(request.getEmail())
                .createDate(LocalDateTime.now().toString())
                .updateDate("")
                .antiguedad(request.getAntiguedad())
                .build();
    }

    public static UserClient requestToEntityClient(UserRequest request) {
        return UserClient.builder()
                .tipo(request.getTipo())
                .nombre(request.getNombre())
                .email(request.getEmail())
                .createDate(LocalDateTime.now().toString())
                .updateDate("")
                .direccion(request.getDireccion())
                .build();
    }

    public static UserEditor requestToEntityEditor(UserRequest request) {
        return UserEditor.builder()
                .tipo(request.getTipo())
                .nombre(request.getNombre())
                .email(request.getEmail())
                .createDate(LocalDateTime.now().toString())
                .updateDate("")
                .horarioJornada(request.getHorarioJornada())
                .build();
    }

    public static UserResponse entityToResponseCreate(UserDocument entity) {
        return UserResponse.builder()
                .tipo(entity.getTipo())
                .nombre(entity.getNombre())
                .email(entity.getEmail())
                .build();
    }

    public static List<UserResponse>
    listEntityToResponse(List<UserDocument> products) {

        var listResponse = new ArrayList<UserResponse>();
        products.forEach(item -> listResponse.add(entityToResponse(item)));
        return listResponse;
    }

    public static <T extends UserDocument> UserResponse entityToResponse(T entity) {
        if (entity instanceof UserAdmin) {
            var entityCast = (UserAdmin) entity;
            return UserResponse.builder()
                    .tipo(entity.getTipo())
                    .nombre(entity.getNombre())
                    .email(entity.getEmail())
                    .build();
        }
        if (entity instanceof UserClient) {
            var entityCast = (UserClient) entity;
            return UserResponse.builder()
                    .tipo(entity.getTipo())
                    .nombre(entity.getNombre())
                    .email(entity.getEmail())
                    .build();
        }
        else {
            var entityCast = (UserEditor) entity;
            return UserResponse.builder()
                    .tipo(entity.getTipo())
                    .nombre(entity.getNombre())
                    .email(entity.getEmail())
                    .build();
        }
    }
}
