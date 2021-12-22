package oops.encapsulations;

public class Student {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if (age>20){
            System.out.println("you are too older to be a student in our nursery school");
        }
        this.age = age;
    }


}
