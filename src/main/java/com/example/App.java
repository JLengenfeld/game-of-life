package com.example;

import com.example.printer.AnimatedPrinter;
import com.example.printer.Printer;

import static java.util.Arrays.deepEquals;

public class App {

    public static void main(String[] args) throws InterruptedException {

        GameOfLife gameOfLife = new GameOfLife();
        Printer printer = new AnimatedPrinter();

        int[][] initialGen = gameOfLife.createInitialGeneration();
        printer.printGeneration(initialGen);

        int[][] nextGen = gameOfLife.calculateNextGeneration(initialGen);
        printer.printGeneration(nextGen);

        while (!deepEquals(nextGen, initialGen)) {
            initialGen = nextGen;
            nextGen = gameOfLife.calculateNextGeneration(initialGen);
            printer.printGeneration(nextGen);
            Thread.sleep(1000L);
        }
    }
}
