package oops.Inharitance;
class Person{
    protected String name;
    public void walk(){
        System.out.println(name +" is walking. ");
    }
    public void eat(){
        System.out.println(name +" is eating. ");
    }
}
class Teacher extends Person{
    public void teach(){
        System.out.println(name +" is teaching. ");
    }
}
class singer extends Person{
    public void sing(){
        System.out.println(name +" is singing. ");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. Rahul";
        t.walk();
        t.eat();
        t.teach();
    }
}
