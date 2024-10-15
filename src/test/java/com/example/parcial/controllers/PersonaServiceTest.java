package com.example.parcial.controllers;


import com.example.parcial.entities.MutantFuntion;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaServiceTest {

    @Test
    public void testRows(){
        String[] dna = {
                "AAATG",
                "TGCAGT",
                "GCTTCC",
                "CCCCTG",
                "GTAGTC",
                "AGTCAC"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testColums(){
        String[] dna = {
                "AGAATG",
                "TGCAGT",
                "GCTTCC",
                "GTCCTC",
                "GTAGTC",
                "GGTCAC"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testMainDiagonals(){
        String[] dna = {
                "AGAATG",
                "TACAGT",
                "GCAGCC",
                "TTGATG",
                "GTAGTC",
                "AGTCAA"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testSecondaryLeftDiagonals(){
        String[] dna = {
                "ATAATG",
                "GTTAGT",
                "GGCTCG",
                "TTGATG",
                "GTAGTC",
                "AGTCAA"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testSecondaryRightDiagonals(){
        String[] dna = {
                "ATAATG",
                "GTATGA",
                "GCTTAG",
                "TTTAGG",
                "GTAGTC",
                "AGTCAA"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testTertiaryLeftDiagonals(){
        String[] dna = {
                "ATGATG",
                "GTAGTA",
                "CCTTGG",
                "TCTAGG",
                "GGCGTC",
                "AGTCAA"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testTertiaryRightDiagonals(){
        String[] dna = {
                "ATGATG",
                "GTATTA",
                "AATTGG",
                "ACTAGT",
                "GGAGTC",
                "AGGCAA"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testNonMutant(){
        String[] dna = {
                "ATGATG",
                "GTCTTA",
                "AATTGG",
                "ACTAGT",
                "GGATTC",
                "AGGCAA"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testMutant1(){
        String[] dna = {
                "AAAA",
                "CCCC",
                "TCAG",
                "GGTC"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testNonMutant1(){
        String[] dna = {
                "AAAT",
                "AACC",
                "AAAC",
                "CGGG"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }

    @Test
    public void testMutant2(){
        String[] dna = {
                "TGAC",
                "AGCC",
                "TGAC",
                "GGTC"
        };
        assertTrue(MutantFuntion.isMutant(List.of(dna)));
    }



}

