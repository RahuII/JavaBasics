package codeWith.Array.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(3);
        myList.add(2);
        myList.add(5);
        myList.add(0);
        myList.add(4);
        for (int x:myList) {
            System.out.println(x);
        }
        System.out.println(myList.size());
    }
}
