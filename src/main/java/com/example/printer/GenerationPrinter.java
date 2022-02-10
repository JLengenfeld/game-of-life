package com.example.printer;

public class GenerationPrinter implements Printer {

    @Override
    public void printGeneration(int[][] initialGen) {
        for (int[] lines : initialGen) {
            StringBuilder line = new StringBuilder("|");
            for (int cells : lines) {
                line.append((cells == 1) ? "*|" : " |");
            }
            System.out.println(line);
        }
        System.out.println();
    }

}
