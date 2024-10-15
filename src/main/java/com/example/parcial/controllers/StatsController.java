package com.example.parcial.controllers;

import com.example.parcial.entities.MutantFuntion;
import com.example.parcial.entities.Mutant;
import com.example.parcial.services.MutantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private MutantService mutantService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getStats() throws Exception {
        Map<String, Object> stats = new HashMap<>();
        List<Mutant> personas = mutantService.findAll();
        long countMutantDna = personas.stream().filter(p -> MutantFuntion.isMutant(p.getDna())).count();
        long countHumanDna = personas.size() - countMutantDna;
        double ratio = (double) countMutantDna / countHumanDna;

        stats.put("count_mutant_dna", countMutantDna);
        stats.put("count_human_dna", countHumanDna);
        stats.put("ratio", ratio);

        return ResponseEntity.ok(stats);
    }
}
