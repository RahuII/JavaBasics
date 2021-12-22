package oops.constructor;

public class passByValue {

	public static void main(String[] args) {
	      int a = 34;
         int b = 6;
         swap(a , b);
         System.out.println(a +" "+ b);

        Dog c = new Dog();
        c.legs = 4;

        Dog d = new Dog();
        d.legs = 8;
        swap(c, d);

        System.out.println(c.legs + " " + d.legs);

    }

     public static void swap(int c, int d) {
         int temp = c;
         c = d;
         d = temp;
     }

    static void swap(Dog a, Dog b) {
        Dog temp = a;
        a = b;
        b = temp;
    }

    
}
class Dog {
    int legs;
}
