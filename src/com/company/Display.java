package com.company;

import java.awt.*;


public class Display extends Canvas {

    int[][] grid1;
    int BoxWidth = 80;

    public void paint(Graphics g){

        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {

                int hor = i * BoxWidth;
                int vert = j * BoxWidth;

                if (grid1[i][j] == 0) {
                    g.setColor(Color.BLUE);
                    g.drawRect(hor, vert, BoxWidth, BoxWidth);
                } else {
                    g.setColor(Color.BLUE);
                    g.fillRect(hor, vert, BoxWidth, BoxWidth);
                }
            }
        }
    }

    public void sendArray(int[][] grid){
        this.grid1 = grid;

    }
}
