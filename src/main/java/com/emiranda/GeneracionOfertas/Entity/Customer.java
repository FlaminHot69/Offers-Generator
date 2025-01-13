package com.emiranda.GeneracionOfertas.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private long clienteSBMX;
    private long clienteISI;
    private String calificacion;
    private CustomerProfile customerProfile;
    private Branch branch;
}
