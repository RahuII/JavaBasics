package projects;



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double b = sc.nextDouble();
        if (b>w){
            if (w%5==0){
                b = b-w-0.5;
                System.out.println(b);
            }
            else
                System.out.println(b);
        }
        else
            System.out.println(b);


    }
}

