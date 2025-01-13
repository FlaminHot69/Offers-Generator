package com.emiranda.GeneracionOfertas.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerProfile {
    private String estrellas;
    private String semaforo;
    private String clasificacion;
}
