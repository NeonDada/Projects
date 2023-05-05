package org.academiadecodigo.bootcamp.glass;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MagicGrid {


    public static void main(String[] args) {


        MyGrid myGrid = new MyGrid(15, 15);

        Player player1 = new Player(new Rectangle(10, 10, 40, 40),myGrid);
        player1.fill();

        new Handler(player1);


    }
}



