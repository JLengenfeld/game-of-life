package com.example;

import static java.util.Arrays.deepEquals;

public class App {

    public static void main(String[] args) throws InterruptedException {

        GameOfLife gameOfLife = new GameOfLife();
        GenerationPrinter printer = new GenerationPrinter();

        int[][] initialGen = gameOfLife.createInitialGeneration();
        printer.printGeneration(initialGen);

        int[][] nextGen = gameOfLife.calculateNextGeneration(initialGen);

        while (!deepEquals(nextGen, initialGen)) {
            printer.printGeneration(nextGen);
            nextGen = gameOfLife.calculateNextGeneration(nextGen);
            Thread.sleep(1000L);
        }
    }
}
