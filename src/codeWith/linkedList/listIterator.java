package codeWith.linkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("mark");
        names.add("rahul");
        names.add("deepak");
        names.add("hello");
        names.add("aditya");
        names.add("good");

        ListIterator<String> itr = names.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("**********************************");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
