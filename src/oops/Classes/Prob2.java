package oops.Classes;
class square{
    public int area(int side){
        return side*side;
    }
    public int perimeter(int a){
        return 4*a;
    }
}
class rectangle{
    public int area(int l,int b,int h){
        return l*b*h;
    }

}
class Circle{
    public float area(int r){
        return 3.14f*r*r;
    }
    public float perimeter(int r){
        return 6.28f*r;
    }
}
public class Prob2 {
    public static void main(String[] args) {
//        square
        square s1 = new square();
        System.out.println(s1.area(4));
        System.out.println(s1.perimeter(4));

//        Circle
        Circle c1 = new Circle();
        System.out.println(c1.area(7));
        System.out.println(c1.perimeter(7));

//        rectangle
        rectangle r1 = new rectangle();
        System.out.println("area of rectangle = "+r1.area(4,6,7));
    }

}
