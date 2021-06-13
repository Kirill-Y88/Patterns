package gb;

import java.awt.*;

public interface ViewObject {
    void update(GameCanvas canvas, float deltaTime);
    void render(GameCanvas canvas, Graphics g);
}
