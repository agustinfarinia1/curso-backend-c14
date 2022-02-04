package com.farinia.clase14.model.concrete;

import com.farinia.clase14.model.UserDocument;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonTypeName("userEditor")
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class UserEditor extends UserDocument {
    private String horarioJornada;
}
