package com.example.parcial.entities;

import java.util.List;

public class MutantFuntion {

    // Convertimos la lista de strings a una matriz de caracteres
    public static char[][] convertToMatrix(List<String> dna) {
        int rows = dna.size();
        int cols = dna.get(0).length();
        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String str = dna.get(i);
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }
        return matrix;
    }

    public static boolean isMutant(List<String> dna){

        boolean is_mutant = false;
        char[][] newDna = convertToMatrix(dna);
        int n = newDna.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Verificación horizontal (asegúrate de que j <= n - 4)
                if (j <= n - 4) {
                    if (newDna[i][j] == newDna[i][j+1] && newDna[i][j] == newDna[i][j+2] && newDna[i][j] == newDna[i][j+3]) {
                        is_mutant = true;
                        System.out.println("Secuencia horizontal detectada!");
                    }
                }

                // Verificación vertical (asegúrate de que i <= n - 4)
                if (i <= n - 4) {
                    if (newDna[i][j] == newDna[i+1][j] && newDna[i][j] == newDna[i+2][j] && newDna[i][j] == newDna[i+3][j]) {
                        is_mutant = true;
                        System.out.println("Secuencia vertical detectada!");
                    }
                }

                // Verificación diagonal ↘ (asegúrate de que i <= n - 4 y j <= n - 4)
                if (i <= n - 4 && j <= n - 4) {
                    if (newDna[i][j] == newDna[i+1][j+1] && newDna[i][j] == newDna[i+2][j+2] && newDna[i][j] == newDna[i+3][j+3]) {
                        is_mutant = true;
                        System.out.println("Secuencia diagonal ↘ detectada!");
                    }
                }

                // Verificación diagonal ↙ (asegúrate de que i <= n - 4 y j >= 3)
                if (i <= n - 4 && j >= 3) {
                    if (newDna[i][j] == newDna[i+1][j-1] && newDna[i][j] == newDna[i+2][j-2] && newDna[i][j] == newDna[i+3][j-3]) {
                        is_mutant = true;
                        System.out.println("Secuencia diagonal ↙ detectada!");
                    }
                }
            }
        }

        System.out.println("¿Es mutante? " + is_mutant);
        return is_mutant;
    }
}
