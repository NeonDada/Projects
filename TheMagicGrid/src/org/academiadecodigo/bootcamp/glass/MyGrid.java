package org.academiadecodigo.bootcamp.glass;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MyGrid {

    private int padding = 10;
    private int cel = 40;

    private int col = 0;

    private int row = 0;

    public int getCol(){return col;}

    public int getRow() {
        return row;
    }


    public int getCel() {
        return cel;
    }

    public int getPadding(){return padding;}



    Rectangle rectangle;


    public MyGrid(int col, int row) {
        this.col = col;
        this.row = row;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                rectangle = new Rectangle(padding + cel * i, padding + cel * j, 40, 40);
                rectangle.draw();
            }


        }




    }

}

