import java.util.Scanner;
import java.util.Random;

/**
 * The main operations for this game needed are:
 * Random number generator with limits x>=100.
 * 
 * Right/Wrong answer checker.
 * Score keeping
 */
//Current Focus: Username imput and long term storage.
public class PercentMain
{

    /** Random number generator part (i.e the main part).*/
    public static void main(String user){
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        Random ranBig= new Random();//Setup for generator


        System.out.printf("Hello, %s, ready to play?\n",user);
        boolean play= true;

        while(play==true){
            int n=3;
            int lives = 2;//not used currently, for Conditional class
            while(n>0){
                int num=random.nextInt(100);//problem generator
                int num2=random.nextInt(50);
                int whole= num2*10;

                System.out.println();//spacing
                System.out.printf("What is %d percent of %d?\nTip: If you get a decimal, round down to zero. ",num,whole);
                int input= scanner.nextInt();
                int correct= (num*whole)/100;

                System.out.println();
                System.out.println();
                System.out.println();

                if(input==correct){
                    n=(n-1);
                    System.out.println("You are Correct!"); 
                    System.out.printf("You have %d questions left until you get 100 pts!\n",n);
                    if(n==0){
                        System.out.println("Congrats, you've earned a 100pts!");
                        System.out.printf("100 points was added to  account:\"5s\"",user);
                        return;
                    }

                }

                else if(input!=correct) {
                    n= n-3;

                    System.out.println("This answer is not correct.");

                    System.out.println("Your answer is: " + input);
                    System.out.println("The correct answer is: " + correct);

                    System.out.println();

                    System.out.println("You have lost this round... oof. Play again?");

                }

                System.out.println();
                System.out.println("Play Again? y/n");
                scanner.nextLine();
                String answer=scanner.nextLine();
                String yes="y";
                boolean b =(answer.equals(yes));
                if (b!=true){
                    play=false;
                    System.out.println();
                    System.out.println("See you later then!");
                    System.out.println('\u000C');
                }
            }
        }
    }
}

