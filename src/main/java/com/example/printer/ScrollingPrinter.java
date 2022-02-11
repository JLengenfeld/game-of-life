package com.example.printer;

public class ScrollingPrinter implements Printer {

    @Override
    public void printGeneration(int[][] initialGen) {
        for (int[] lines : initialGen) {
            System.out.print("|");
            for (int cells : lines) {
                System.out.print((cells == 1) ? "*|" : " |");
            }
            System.out.println(); // line break
        }
        System.out.println(); // empty line after whole grid
    }
}
