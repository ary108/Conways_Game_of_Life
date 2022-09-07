package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Grid {

    public Grid() {}

    public void gridCreate() throws InterruptedException {

        int[][] grid = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

    Display landscape = new Display();
    JFrame g = new JFrame();
        g.add(landscape);
        g.setSize(1550, 850);
        g.setVisible(true);
        g.setTitle("Aryan's Game of Life Implementation");

    int row = 10, col = 10;

        landscape.sendArray(grid);
        landscape.repaint();

        System.out.println("How many times do you want to run the Game of Life?");

    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int num1 = num;

        System.out.println("Spawning Life...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Evolving Cells...");
        TimeUnit.SECONDS.sleep(1);

        for (int i = 0; i<=num1; i++)

    {

        landscape.sendArray(grid);
        landscape.repaint();
        NextGen.nextGeneration(grid, row, col);

        }
    }
}
