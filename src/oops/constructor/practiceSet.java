package oops.constructor;
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
        public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return (2*Math.PI* radius* height) + (2* Math.PI* Math.pow(radius,2));
    }

}
class rectangle{
    private int height;
    private int breath;

    public rectangle() {
        this.height = 4;
        this.breath = 5;
    }

    public int getHeight() {
        return height;
    }

    public int getBreath() {
        return breath;
    }
}
public class practiceSet {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(7,8);
        // myCylinder.setHeight(40);
        // myCylinder.setRadius(7);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        rectangle r = new rectangle();
        System.out.println(r.getHeight());
        System.out.println(r.getBreath());
    }
}
