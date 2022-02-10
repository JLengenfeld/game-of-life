package com.example;

public class GameOfLife {

    public int[][] createInitialGeneration() {
        return new int[][]{ //
                {1, 0, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}};
    }

    public int[][] calculateNextGeneration(int[][] generation) {
        int maxX = generation.length;
        int maxY = generation[0].length;
        int[][] nextGen = new int[maxX][maxY];

        for (int x = 0; x < maxX; x++) {
            for (int y = 0; y < maxY; y++) {
                boolean alive = (generation[x][y] == 1);
                int neighbours = countNeighbours(x, y, generation);
                if (alive && (neighbours == 2 || neighbours == 3)) {
                    nextGen[x][y] = 1;
                } else if (!alive && neighbours == 3) {
                    nextGen[x][y] = 1;
                } else {
                    nextGen[x][y] = 0;
                }
            }
        }

        return nextGen;
    }

    private int countNeighbours(int x, int y, int[][] generation) {
        int neighbours = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                boolean isWithinBounds = (i >= 0) && (j >= 0) && (i < generation.length) && (j < generation[i].length);
                boolean isNotSelf = !((i == x) && (j == y));
                if (isWithinBounds && isNotSelf && generation[i][j] == 1) {
                    neighbours++;
                }
            }
        }
        return neighbours;
    }

}
