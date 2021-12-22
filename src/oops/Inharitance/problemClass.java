package oops.Inharitance;
class Circle{
    Circle(int r){
        this.radius = r;
    }
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends Circle{
    public int height;
    cylinder(int r, int h){
        super(r);
        this.height = h;
    }
    public double Volume(){
        return Math.PI*this.radius*this.radius*height;
    }

}
public class problemClass {
    public static void main(String[] args) {
//        Circle obj = new Circle(7);
//        System.out.println(obj.area());
        cylinder c = new cylinder(5,8);
        System.out.println(c.Volume());
    }
}
