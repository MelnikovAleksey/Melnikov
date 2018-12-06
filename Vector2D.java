/**
 * Created by student4 on 29.11.18.
 */
import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;
    public static int count;

    public Vector2D (){
        this.vX = 1;
        this.vY = 1;
        this.count ++;
    }

    public Vector2D (double X, double Y){
        this.vX = X;
        this.vY = Y;
        this.count ++;
    }

    public Vector2D (Vector2D v){
        this.vX = v.vX;
        this.vY = v.vY;
        this.count ++;
    }

    public void print (){
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", this.vX, this.vY));
    }

    public double length(){
        double len;
        len = Math.sqrt(this.vX*this.vX + this.vY*this.vY);
        return len;
    }

    public void add(Vector2D v){
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v){
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor){
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void normalized(){
        this.vX = 1/Math.sqrt(this.vX*this.vX + this.vY*this.vY)*this.vX;
        this.vY = 1/Math.sqrt(this.vX*this.vX + this.vY*this.vY)*this.vY;
    }

    public double dotProduct(Vector2D v){
        return (v.vX*this.vX)+(v.vY*this.vY);
    }
}