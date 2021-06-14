package gb;

import java.awt.*;

public interface ViewFigure {

    void update(GameCanvas canvas, float deltaTime);
    void render(GameCanvas canvas, Graphics g);
}
