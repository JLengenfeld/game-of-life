package com.example.printer;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class AnimatedPrinter implements Printer {

    public AnimatedPrinter() {
        AnsiConsole.systemInstall();
        System.out.println(ansi().eraseScreen().cursorMove(0, 0));
    }

    @Override
    public void printGeneration(int[][] initialGen) {
        System.out.println(ansi().cursorUpLine(initialGen.length + 1));

        for (int[] lines : initialGen) {
            StringBuilder line = new StringBuilder("|");
            for (int cells : lines) {
                line.append((cells == 1) ? "@|yellow *|@|" : " |");
            }
            System.out.println(ansi().render(line.toString()));
        }
    }
}
