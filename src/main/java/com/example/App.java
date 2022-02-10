package com.example;

public class App {

    public static void main(String[] args) throws InterruptedException {

        GameOfLife gameOfLife = new GameOfLife();

        int[][] initialGen = gameOfLife.createInitialGeneration();
        gameOfLife.printGeneration(initialGen);

        int[][] nextGen = gameOfLife.calculateNextGeneration(initialGen);

        while (1 >= 0) {
            gameOfLife.printGeneration(nextGen);
            nextGen = gameOfLife.calculateNextGeneration(nextGen);
            Thread.sleep(1000L);
        }
    }
}
