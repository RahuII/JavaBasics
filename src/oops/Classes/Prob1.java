package oops.Classes;

class Employee{
    int salary;
    String name;

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
class cellPhone{
    public void ringing(){
        System.out.println("Phone is ringing...... ");
    }
    public void vibrating(){
        System.out.println("Phone is vibrating.......... ");
    }
}
public class Prob1 {
    public static void main(String[] args) {
//      problem 1

        Employee E1 = new Employee();
        E1.setName("Rahul Kumar");
        E1.salary = 6000;
        System.out.println(E1.getName());
        System.out.println(E1.getSalary());

//      Problem 2
        cellPhone redmiPhone = new cellPhone();
        cellPhone iPhone = new cellPhone();
        redmiPhone.ringing();
        iPhone.vibrating();
    }
}
