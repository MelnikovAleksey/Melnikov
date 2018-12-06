/**
 * Created by student4 on 27.11.18.
 */
class Rectangle extends Figure implements Moveable{
    float width;
    float height;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }
    @Override
    public double getArea(){
        return this.height*this.width;
    }

    @Override
    double getPerimeter() {
        return 2*(this.height + this.width);
    }

    @Override
    public void move(float dx, float dy) {
        this.x = dx;
        this.y = dy;
    }

    @Override
    public void resize(float koeff) {
        this.height *= koeff;
        this.width *= koeff;
    }

}
