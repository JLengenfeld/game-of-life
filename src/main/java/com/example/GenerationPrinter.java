package com.example;

import java.util.Random;

public class GenerationPrinter {

    public void printGeneration() {

        boolean[][] generation = createInitialGeneration();
        printBooleanGeneration(generation);

        char[][] charGen = createRandomInitialGenerationChars();
        printCharGeneration(charGen);

    }



    private void printBooleanGeneration(boolean[][] generation) {
        for (int x = 0; x < generation.length; x++) {
            String line = "|";
            for (int y = 0; y < generation.length; y++) {
                line += generation[x][y] ? "*|" : " |";

            }
            System.out.println(line);
        }
        System.out.println();
    }

    private void printCharGeneration(char[][] generation) {
        for (int x = 0; x < generation.length; x++) {
            String line = "|";
            for (int y = 0; y < generation.length; y++) {
                line += generation[x][y] == 'X' ? "*|" : " |";

            }
            System.out.println(line);
        }
        System.out.println();
    }



    private boolean[][] createRandomInitialGeneration() {
        Random random = new Random();
        boolean[][] generation = new boolean[5][5];

        for (int x = 0; x < generation.length; x++) {
            for (int y = 0; y < generation.length; y++) {
                generation[x][y] = random.nextBoolean();
            }
        }
        return generation;
    }

    
    private char[][] createRandomInitialGenerationChars() {

        String chars = "XO";
        Random rnd = new Random();

        char[][] generation = new char[5][5];
        for (int x = 0; x < generation.length; x++) {
            for (int y = 0; y < generation.length; y++) {
                generation[x][y] = chars.charAt(rnd.nextInt(chars.length()));
            }
        }
        return generation;
    }

    
    private boolean[][] createInitialGeneration() {
        return new boolean[][] { //
                { true, false, true },
                { false, true, false },
                { true, false, true } };
    }

    private int[][] createInitialGenerationNumbers() {

        return new int[][] { //
                { 1, 0, 1 },
                { 1, 0, 1 },
                { 1, 0, 1 } };

    }

    private char[][] createInitialGenerationStrings() {
        return new char[][] { //
                { 'X', 'O', 'X' },
                { 'X', 'O', 'X' },
                { 'X', 'O', 'X' } };
    }
    
}
