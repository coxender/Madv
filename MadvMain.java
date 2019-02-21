
/**
 * Main part of the game. Contains the switch statements and choice gameplay.
 *
 * @author (Chiara Oxender)
 * @version (2.1)
 */
/**
 * TO DO:
 * _Add enter after closed choices
 * _Add default case
 * 
 * 
 */
public class MadvMain
{
    public static void main(String user){//MainScreen
        System.out.printf("Hello %s, which WorldShell will you enter today?\n",user);
        System.out.println("In.World [1]\nMid.World [2]\n"
            + "Out.World [3]\nDead.World [4]\n" 
            + "Wait, What are These Worlds?[info]");//chapters dialouge

        String response=Action.choice(user);
        switch(response){
            case "1"://World 1 Response
            if (user.equals("Nick")){

                System.out.println("You have not unlocked this world yet");
                Action.enter();
                main(user);
            }
            else if (user.equals("Luke")){
                System.out.println("You have not unlocked this world yet");
                Action.enter();
                main(user);
            }
            else if (user.equals("Chiara")){
                System.out.println("You know you haven't written this yet, get back to work");
                Action.enter();
                main(user);
            }
            break;

            case "2"://World 2 Response
            if (user.equals("Nick")){

                System.out.println("You have not unlocked this world yet");
                
                Action.enter();
                main(user);//back to main screen
            }
            else if (user.equals("Luke")){
                System.out.println("You have not unlocked this world yet");
                Action.enter();
                main(user);
            }
            else if (user.equals("Chiara")){
                System.out.println("You know you haven't written this yet, wth");
                Action.enter();
                main(user);
            }
            break;

            case "3"://World 3 Response
            if (user.equals("Nick")){

                System.out.println("You have not unlocked this world yet");
                Action.enter();
                main(user);
            }
            else if (user.equals("Luke")){
                System.out.println("You have not unlocked this world yet");
                Action.enter();
                main(user);
            }
            else if (user.equals("Chiara")){
                System.out.println("You know you haven't written this yet, wth");
                Action.enter();
                main(user);
            }
            break;
            
            case "info"://Background
                Story.info();//Sends to Story class
                main(user);//Back to main screen
               
            break;
            default:
                return;
            

        }
    }
    
    public static void innerWorld(String user){
    
    }
}
