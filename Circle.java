/**
 * Created by student4 on 29.11.18.
 */
class Circle extends Figure implements Moveable{
    float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public void move(float dx, float dy) {
        this.x = dx;
        this.y = dy;
    }

    @Override
    public void resize(float koeff) {
        this.radius *= koeff;
    }
}
