/**
 * @author Yurii Malikov
 */
public class BlackFactory extends BaseFactory {

    @Override
    Circle createCircle() {
        return new BlackCircle();
    }

    @Override
    Triangle createTriangle() {
        return new BlackTriangle();
    }

    @Override
    public Rectangle createRectangle() {
        return new BlackRectangle();
    }
}
