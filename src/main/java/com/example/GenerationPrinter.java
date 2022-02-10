package com.example;

public class GenerationPrinter {

    public void printGeneration(int[][] initialGen) {

        for (int x = 0; x < initialGen.length; x++) {
            String line = "|";
            for (int y = 0; y < initialGen[x].length; y++) {
                String newCell;
                if (initialGen[x][y] == 1) {
                    newCell = "*|";
                } else {
                    newCell = " |";
                }
                line = line + newCell;
            }
            System.out.println(line);
        }
        System.out.println();
    }

}
