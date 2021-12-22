package oops.Classes;

public class Main {
    public static void main(String[] args) {

//        First method
        System.out.println("\n********************* Student - 1 Information *********************");
        student s1 = new student();
        s1.name = "Aditya kumar";
        s1.age = 20;
        s1.id = 17406;
        s1.roll = 190570107137L;
        s1.address = "Sitarampur Baghari Runnisaidpur Sitamarhi Bihar 843323";
        System.out.println(s1.name+"\n"+s1.age+"\n"+s1.id+"\n"+s1.roll+"\n"+s1.address);

//        Second method
        System.out.println("\n********************* Student - 2 Information *********************");
        student s2 = new student();
        s2.setName("Rahul Kumar");
        s2.setAge(19);
        s2.setId(17407);
        s2.setRoll(190570107138L);
        s2.setAddress("Sitarampur Baghari Runnisaidpur Sitamarhi Bihar 843323");
        System.out.println(s2.getName()+"\n"+s2.getAge()+"\n"+s2.getId()+"\n"+s2.getRoll()+"\n"+s2.getAddress());


    }
}
class student {
    String name, address;
    int id, age;
    long roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getRoll() {
        return roll;
    }

    public void setRoll(long roll) {
        this.roll = roll;
    }
}
