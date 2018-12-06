import java.util.Locale;

/**
 * Created by student4 on 11.10.18.
 */
class Employee extends Person{
    String company;
    public Employee(String name, int age, String company){
        super(name, age);
        this.company = company;
        this.name = name;
        this.age= age;
    }

    @Override
    public String toString(){
        return String.format(Locale.US, "(%s, %d, %s)", this.name, this.age, this.company);}
    public String work(){
        return "Manager";
    }
}