package gb;

public class RectangleFactory implements FigureFactory{
    @Override
    public Sprite create() {
        return new Rectangle();
    }
}
