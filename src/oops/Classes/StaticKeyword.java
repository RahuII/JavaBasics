package oops.Classes;


public class StaticKeyword {
    public static void main(String[] args) {
//        Static member belong to the class instead of a specific instead
//        With static keyword
        Hello.DoSomething("Hii rahul Do something");

//        Without static keyword
        Hello h1 = new Hello();
        h1.DoSomethingElse("Good morning Rahul do something");

    }
}


class Hello{
    public static void DoSomething(String massage){
        System.out.println(massage);
    }
    public void DoSomethingElse(String massage){
        System.out.println(massage);
    }
}
