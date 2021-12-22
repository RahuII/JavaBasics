package oops.constructor;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube();
        System.out.println("Cube1 volume is "+cube1.getCubeVolume());

        Cube cube2 = new Cube(43,54,67);
        System.out.println("Cube volume is "+cube2.getCubeVolume());
    }
}
