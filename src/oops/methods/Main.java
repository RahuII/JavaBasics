package oops.methods;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("\n||||||||||||||||||||||||||||STUDENT-1 INFORMATION|||||||||||||||||||||||||||");
         student s1 = new student();
         s1.name ="Rahul Kumar";
         s1.id = 17407;
         s1.roll = 190570107138L;
         s1.add = "Sitarampur, Baghari, Runnisaidpur, Sitamarhi, Bihar 843323";
         System.out.println(s1.name+"\n"+s1.id+"\n"+s1.roll+"\n"+s1.add);

         System.out.println("\n||||||||||||||||||||||||||||STUDENT-2 INFORMATION|||||||||||||||||||||||||||");
         student s2 = new student();
         s2.name ="Aditya Kumar";
         s2.id = 17408;
         s2.roll = 190570107139L;
         s2.add = "Sitarampur, Baghari, Runnisaidpur, Sitamarhi, Bihar 843323";
         System.out.println(s2.name+"\n"+s2.id+"\n"+s2.roll+"\n"+s2.add);

 */
         System.out.println("\n||||||||||||||||||||||||||||STUDENT-1 INFORMATION|||||||||||||||||||||||||||");
         student s1 = new student();
         s1.setName("Rahul kumar");
         s1.setId(17407);
         s1.setRoll(190570107138L);
         s1.setAdd("Sitarampur, Baghari, Runnisaidpur, Sitamarhi, Bihar 843323");
         System.out.println(s1.getName()+"\n"+s1.getId()+"\n"+s1.getRoll()+"\n"+s1.getAdd());

        System.out.println("\n||||||||||||||||||||||||||||STUDENT-2 INFORMATION|||||||||||||||||||||||||||");
        student s2 = new student();
        s2.setName("Aditya Kumar");
        s2.setId(17408);
        s2.setRoll(190570107139L);
        s2.setAdd("Sitarampur, Baghari, Runnisaidpur, Sitamarhi, Bihar 843323");
        System.out.println(s2.getName()+"\n"+s2.getId()+"\n"+s2.getRoll()+"\n"+s2.getAdd());
    }
}
