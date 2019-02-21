import java.util.Scanner;
/**
 *These are the side actions that I have to write a bazillion times...
 *I'm just lazy...
 */
public class Action
{
    public static String choice(String user){
        Scanner scanner =new Scanner(System.in);
        System.out.printf("%s's Choice:",user);
        String response= scanner.nextLine();
        return(response);
    }

    public static void enter(){
        Scanner scanner =new Scanner(System.in);
        System.out.println();
        System.out.println("---------------");
        System.out.println("Press Enter to Continue");
        String input=scanner.nextLine();//To get enter response
        
        String enter="";
        boolean compare=enter.equals(input);
        if (compare==true){
            System.out.println('\u000C');   
        }
        else{
            enter();
        }
         return;
    }
}

