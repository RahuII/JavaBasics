package oops.Abstraction;

public class repairShop {
    public static void repairCar(Car Car){
        System.out.println("car is repaired");
    }
    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        Audi audi = new Audi();
        repairCar(wagonR);
        repairCar(audi);

    }
}
