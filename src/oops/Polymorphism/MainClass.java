package oops.Polymorphism;

public class MainClass {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        Pet p = d;
//        Animal a = d;
//
//        d.walk();
//        p.walk();
        Greeting("Hi there", 4);
    }
    public static void Greeting(){
        System.out.println("Good morning");
    }
    public static void Greeting(String s){
        System.out.println(s);
    }
    public static void Greeting(String s, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}
