package projects.Game;

import java.util.Random;
import java.util.Scanner;

class game{
        int Count = 0, number, inputNumber;

        game(){
            Random rand = new Random();
            this.number = rand.nextInt(100);
        }
        void takeUserInput(){
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
        }
        boolean isThisTrue(){
            Count ++;
            if (inputNumber == number){
                System.out.println("You get it in "+ Count+" attempt");
                return true;

            }
            else if (inputNumber>number){
                System.out.println("too high..");
            }
            else {
                System.out.println("too low..");
            }
            return false;
        }
    }
public class Main {

    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isThisTrue();
        }
    }
}
