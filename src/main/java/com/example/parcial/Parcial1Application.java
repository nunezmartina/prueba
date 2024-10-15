package com.example.parcial;

import com.example.parcial.entities.MutantFuntion;
import com.example.parcial.entities.Mutant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Parcial1Application {

	public static void main(String[] args) {

		SpringApplication.run(Parcial1Application.class, args);
		System.out.println("funcionando");
	}

	List<String> dna_example = Arrays.asList("ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG");

	Mutant persona1 = Mutant.builder().dna(dna_example).build();

	boolean result = MutantFuntion.isMutant(persona1.getDna());



}