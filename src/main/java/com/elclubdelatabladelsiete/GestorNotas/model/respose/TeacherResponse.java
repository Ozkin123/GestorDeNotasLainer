package com.elclubdelatabladelsiete.GestorNotas.model.respose;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TeacherResponse {
    String name;
    String lastName;
}
