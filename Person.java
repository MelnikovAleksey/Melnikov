/**
 * Created by student4 on 11.10.18.
 */
import java.util.Locale;

class Person {
    int age;
    String name;
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String work(){
        return "None";
    }
    @Override
    public String toString(){
        return String.format(Locale.US, "(%s, %d)", this.name, this.age);
    }
}
