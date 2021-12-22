package codeWith.linkedList;

import java.util.HashSet;
import java.util.Iterator;

public class hasSet {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("rahul");
        name.add("mark");
        name.add("tom");
        name.add("tom");
        name.add("jack");
        name.add("july");
        name.add("patric");
//        for (String x :
//                name) {
//            System.out.println(x);
//        }
        name.remove("tom");
        Iterator<String> itr = name.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
