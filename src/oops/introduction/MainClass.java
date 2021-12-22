package oops.introduction;

class Cat {
    boolean hasFur;
    String colour, bread;
    int legs, eyes, Ncat;

    public void walk() {
        System.out.println("Cat is walking");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void discription() {
        System.out.println(Ncat + " Cat has " + legs + " legs and " + eyes + " eyes");
    }
}

class Dog {
    String breed, name;
    public void jump(){
        System.out.println("My dog "+ name +" jumped");
    }
    public void description(){
        System.out.println("My dog's name is "+ name +" and it's breed is "+ breed );
    }
}

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.Ncat = 1;
        cat2.Ncat = 2;
        cat1.eyes = 2;
        cat1.legs = 4;
        cat2.eyes = 2;
        cat2.legs = 2;
        cat1.walk();
        cat2.eat();
        cat1.discription();
        cat2.discription();
         
        Dog husky = new Dog();
        Dog poodle = new Dog();

        husky.breed = "Husky";
        husky.name = "Browny";

        poodle.breed = "Poodle";
        poodle.name = "mr. Moolchand tripathi";

        husky.jump();
        husky.description();
        poodle.jump();
        poodle.description();
         

    }
}
