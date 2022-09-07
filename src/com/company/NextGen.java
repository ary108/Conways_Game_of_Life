package com.company;

import java.util.concurrent.TimeUnit;

public class NextGen {

    public static void nextGeneration(int[][] grid, int row, int col) throws InterruptedException {

        int[][] array2 = new int[row][col];

        for (int x = 1; x < row - 1; x++) {
            for (int y = 1; y < col - 1; y++) {

                int friends = 0;

                for (int a = -1; a <= 1; a++) {
                    for (int b = -1; b <= 1; b++) {

                        friends += grid[x+a][y+b];
                    }
                }

                friends -= grid[x][y];

                //friends are less than two, dies alone
                if ((grid[x][y] == 1) && (friends < 2)) {
                    array2[x][y] = 0;

                    //friends are too many, dies of overpopulated surroundings
                } else if ((grid[x][y] == 1) && (friends > 3)) {
                    array2[x][y] = 0;

                    //many friends around, cell is spawned into existence
                } else if ((grid[x][y] == 0) && (friends == 3)) {
                    array2[x][y] = 1;

                    //stays the same, whether it is alive or dead
                } else {
                    array2[x][y] = grid[x][y];
                }

            }
        }

// create a gap between every generation display
        TimeUnit.SECONDS.sleep(1);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                grid[i][j] = array2[i][j];
            }
        }
    }
}
