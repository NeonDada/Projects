package org.academiadecodigo.bootcamp.glass;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player {


    private Rectangle player;
    private  Rectangle newRectangle;

private MyGrid grid;

    public Player(Rectangle player, MyGrid grid) {
        this.player = player;
        this.grid = grid;
    }



    public void fill() {
        player.fill();
    }

    public void doDraw() {
        player.draw();
    }

    public void moveRight() {

        if (player.getX() < ((grid.getCol()*grid.getCel())-(grid.getPadding()+ grid.getCel()))) {
            player.translate(40, 0);}
    }

    public void moveLeft() {
        if (player.getX() > grid.getPadding())
            player.translate(-40, 0);
    }

    public void moveUp() {
        if (player.getY() > grid.getPadding())
        player.translate(0, -40);
    }

    public void moveDown() {
        if (player.getY() < ((grid.getRow()*grid.getCel())-(grid.getPadding()+ grid.getCel())))
        player.translate(0, 40);
    }

    public void doPaint() {
        newRectangle = new Rectangle(player.getX(), player.getY(), grid.getCel(), grid.getCel());
        newRectangle.fill();
    }

    public void doPaintColor() {
        newRectangle = new Rectangle(player.getX(), player.getY(), grid.getCel(), grid.getCel());
        newRectangle.setColor(Color.GREEN);
        newRectangle.fill();
    }

    public void doDelete() {
        newRectangle = new Rectangle(player.getX(), player.getY(), grid.getCel(), grid.getCel());
        newRectangle.setColor(Color.WHITE);
        newRectangle.fill();
        newRectangle = new Rectangle(player.getX(), player.getY(), grid.getCel(), grid.getCel());
        newRectangle.draw();
        newRectangle.setColor(Color.BLACK);
    }



}
