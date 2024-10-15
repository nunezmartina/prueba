package com.example.parcial.controllers;

import com.example.parcial.entities.MutantFuntion;
import com.example.parcial.entities.Mutant;
import com.example.parcial.services.MutantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/persona")
public class MutantController extends BaseControllerImpl<Mutant, Long> {

    @Autowired
    private MutantService personaService;

    @PostMapping("/mutant")
    public ResponseEntity<?> controlPerson(@RequestBody Mutant persona) {
        try {
            boolean isMutant = MutantFuntion.isMutant(persona.getDna());
            personaService.save(persona);
            if (isMutant) {
                return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"Mutant detected\"}");
            } else {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body("{\"message\": \"No Mutant detected\"}");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}
