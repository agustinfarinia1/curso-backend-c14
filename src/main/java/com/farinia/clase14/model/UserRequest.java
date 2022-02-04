package com.farinia.clase14.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String tipo;
    private String nombre;
    private String email;
    private int antiguedad;
    private String direccion;
    private String horarioJornada;
}
