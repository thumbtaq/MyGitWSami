package forLoopPractice;

import java.util.Scanner;

public class ScannerPracticeAndMore {
    public static void main(String[] args) {
        Scanner myFirst = new Scanner(System.in);
        //myFirst.next();
        String C = "chan";
        C.length();
        tim("Hmm now the reason this works is because our tim method has a String argument and an int passed through, which means in the future we will need to call the method with a string and an int(we could choose 1 or the other in the future) inside the parameters\n", 2);
        System.out.println(C);
        System.out.println(add2(75) + " appears because we told our method add2 to pass an int which is x and add 25 to it, and then we chose 75 as the base");
        System.out.println((lookAtMe("Hello my head is beginning to hurt")));
    }
    public static void tim(String leggo, int x){
        for ( int y = 0; y < x; y++){
            System.out.println(leggo);
        }

    }
    public static int add2(int x){
        return x + 25;


    }
    public static String lookAtMe(String x){
        return x + "!";
    }
}
