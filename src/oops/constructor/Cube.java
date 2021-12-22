package oops.constructor;

public class Cube {
    int height, length, breath;
    public int getCubeVolume(){
        return length*breath*height;
    }

//                  Constructor
    Cube(){
        System.out.println("We are in Constructor");
        length = 40;
        breath = 43;
        height = 54;
    }

//                  Constructor Overloading:
//    When we use same constructor in same parameter we called as constructor overloading
        Cube(int l, int b, int h){
            length = l;
            breath = b;
            height = h;
        }
}
