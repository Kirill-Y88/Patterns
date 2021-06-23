package gb;

public class BallFactory implements FigureFactory{
    @Override
    public Sprite create() {
        return new Ball();
    }
}
