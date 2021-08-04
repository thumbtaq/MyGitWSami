package forLoopPractice;

import PracticeOne.ExampleOne;
import PracticeOne.ExampleOnePt2;

public class DiscordFuncts {

    public static void main(String[] args) {
        ExampleOnePt2 forTheSakeOfDiscord = new ExampleOnePt2();
        int num;
        int j;
        num = 0;
        System.out.println("This is the beginning of my Test code results: ");
        addSum();
        letsTrySomeDivision();
        ExampleOne.main();


    }
    public static void letsTrySomeDivision(){
        int num;
        num = 0;
        float num1;
        float num2;
        float num3;
        float num4;
        num1 = 50.5000f;
        num2 = 100.1000f;
        num3 = 50.25f;
        num4 = 72.39f;
        double j = 27.90f;
        System.out.println( num2 / num1);
        System.out.println(num3 / num1);
        System.out.println(num2 / j);
    }


    public static void examplesOffTheDomeAreFun(){


    }

    public static void  addSum() {
        int j = 7;
        int y = 9;
        System.out.println(j + y);
        //num = num + 1;
        j = 12;
        System.out.println(y + j);
        for(; j > 0; j--){
            System.out.println("Sally closed her eyes and began to countdown from " + j);
            System.out.println("Break me a piece of that kit kat bar cut-1");
            while( j < 5){
                System.out.println("Pause");
            }
            break;

            //System.out.println(j);

    }

}
}


