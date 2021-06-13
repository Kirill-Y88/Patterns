package gb;

import java.awt.*;

public class FigureBall implements MovingObject {
    private float x;
    private float y;
    private float halfWidth;
    private float halfHeight;

    private final Color color = new Color (
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );
    private float vX = (float)(100f + (Math.random() * 200f));
    private float vY = (float)(100f + (Math.random() * 200f));

    public FigureBall() {
        halfHeight = 20 + (float)(Math.random() * 50f);
        halfWidth = halfHeight;
    }


    @Override
    public float getLeft() {
        return x - halfWidth;
    }

    @Override
    public void setLeft(float left) {
        x = left + halfWidth;
    }

    @Override
    public float getRight() {
        return x + halfWidth;
    }

    @Override
    public void setRight(float right) {
        x = right - halfWidth;
    }

    @Override
    public float getTop() {
        return y - halfHeight;
    }

    @Override
    public void setTop(float top) {
        y = top + halfHeight;
    }

    @Override
    public float getBottom() {
        return y + halfHeight;
    }

    @Override
    public void setBottom(float bottom) {
        y = bottom - halfHeight;
    }

    @Override
    public float getWidth() {
        return 2f * halfWidth;
    }

    @Override
    public float getHeight() {
        return 2f * halfHeight;
    }

    public Color getColor() {
        return color;
    }

    public float getvX() {
        return vX;
    }

    public void setvX(float vX) {
        this.vX = vX;
    }

    public float getvY() {
        return vY;
    }

    public void setvY(float vY) {
        this.vY = vY;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getHalfWidth() {
        return halfWidth;
    }

    public void setHalfWidth(float halfWidth) {
        this.halfWidth = halfWidth;
    }

    public float getHalfHeight() {
        return halfHeight;
    }

    public void setHalfHeight(float halfHeight) {
        this.halfHeight = halfHeight;
    }
}
