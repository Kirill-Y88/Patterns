package gb;

import java.awt.*;

public class Sprite_ implements ViewObject{
    private MovingObject figure;

    public Sprite_(MovingObject figure) {
        this.figure = figure;
    }



    @Override
    public void update(GameCanvas canvas, float deltaTime) {
        figure.setX(figure.getX() + figure.getvX()*deltaTime);
        figure.setY(figure.getY() + figure.getvY()*deltaTime);
        if (figure.getLeft() < canvas.getLeft()) {
            figure.setLeft(canvas.getLeft());
            figure.setvX(-figure.getvX());
        }
        if (figure.getRight()  > canvas.getRight()) {
            figure.setRight(canvas.getRight());
            figure.setvX(-figure.getvX());
        }
        if (figure.getTop() < canvas.getTop()) {
            figure.setTop(canvas.getTop());
            figure.setvY(-figure.getvY());
        }
        if (figure.getBottom() > canvas.getBottom()) {
            figure.setBottom(canvas.getBottom());
            figure.setvY(-figure.getvY());
        }
    }

    @Override
    public void render(GameCanvas canvas, Graphics g) {
        g.setColor(figure.getColor());
        g.fillOval((int) figure.getLeft(), (int) figure.getTop(),
                (int) figure.getWidth(), (int) figure.getHeight());
    }
}
