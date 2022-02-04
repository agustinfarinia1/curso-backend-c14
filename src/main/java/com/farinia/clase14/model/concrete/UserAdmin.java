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
@JsonTypeName("userAdmin")
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class UserAdmin extends UserDocument {
    private int antiguedad;
}
