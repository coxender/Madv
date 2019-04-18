   import java.util.Scanner;
//Need this to return the current amount of points for each user. 
/**
 * The entry into the game, to be run from terminal
 *
 * @author Chiiara Oxender
 * @version 1.1 (02/20/19) 
 */
public class Login
{


    public static void main(String []args){
        System.out.println("Welcome to MAdv!\n Please enter your ID:");
        Scanner scan = new Scanner(System.in);
        String username=scan.nextLine();
        username.toLowerCase();
       
       switch(username){
            case "Nick":
            MadvMain.main("nick");
            break;
        case "luke":
            MadvMain.main("Luke");
            break;
        case "Chiara":
            MadvMain.main("chiara");
            break;
        default:
        System.out.println("Incorrect username, please try again");
        }
    
    
    }
    
}

