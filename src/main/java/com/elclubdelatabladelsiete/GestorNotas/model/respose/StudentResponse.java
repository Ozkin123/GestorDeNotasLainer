package com.elclubdelatabladelsiete.GestorNotas.model.respose;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

@Data
public class StudentResponse {
    private String name;
    private String lastName;
}
