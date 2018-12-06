import java.sql.Time;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;


/**
 * Created by student4 on 11.10.18.
 */
public class Main {
public static void main (String[] args){
    Vector2D vA = new Vector2D();
    Vector2D vB = new Vector2D(5.0, 7.0);
    Vector2D vC = new Vector2D(vB);
    vA.add(vB);
    vA.print();
    vA.sub(vC);
    vA.print();
    System.out.println(vB.length());
    vC.scale(1.5);
    vC.print();
    vC.normalized();
    System.out.println(vC.length());
    vC.scale(2);
    System.out.println(vA.dotProduct(vB));
    System.out.println(vA.count);
}}