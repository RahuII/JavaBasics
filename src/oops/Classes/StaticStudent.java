package oops.Classes;

public class StaticStudent {
    public static void main(String[] args) {
        Students rahul = new Students();
        System.out.println(rahul.getNoOfStudent());

        Students aditya = new Students();
        System.out.println(aditya.getNoOfStudent());
//        System.out.println(Students.getNoOfStudent());
    }
}
class Students {
    String name;
    int age;
    static int noOfStudent;
    Students(){
        noOfStudent ++;
    }
    public static int getNoOfStudent(){
        return noOfStudent;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
