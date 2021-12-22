package oops.encapsulations;

public class EncapsulationIntroduction {
    public static void main(String[] args) {

        Student obj = new Student();
//        obj.name = "Tom";
        obj.setName("Rahul");
        obj.setAge(44);
        System.out.print(obj.getName()+" ");
        System.out.print(obj.getAge());
    }
}
