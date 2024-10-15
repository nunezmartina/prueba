package com.example.parcial.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Mutant extends Base {

    @Column(name = "dna")
    private List<String> dna;
    private boolean isMutant;

}

