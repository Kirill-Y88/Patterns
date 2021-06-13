package gb;

import java.awt.*;

public interface MovingObject {
    float getLeft();
    void setLeft(float left);
    float getRight();
    void setRight(float right);
    float getTop();
    void setTop(float top);
    float getBottom();
    void setBottom(float bottom);
    float getWidth();
    float getHeight();
    public Color getColor();

    public float getvX();

    public void setvX(float vX);

    public float getvY();

    public void setvY(float vY);

    public float getX();

    public void setX(float x);

    public float getY();

    public void setY(float y);

    public float getHalfWidth();

    public void setHalfWidth(float halfWidth);

    public float getHalfHeight();

    public void setHalfHeight(float halfHeight);
}
