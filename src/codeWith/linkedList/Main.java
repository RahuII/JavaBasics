package codeWith.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> name = name = new LinkedList<String>();
        name.add("patrik");
        name.add("rahul");
        name.add("mark");
        name.add("tom");
        name.add("john");
        name.add("jack");
        name.add(1,"index1");
        System.out.println(name.size());
        for (String x :
                name) {
            System.out.println(x);
        }
    }
}
