package rockpaperscissors2;



import static java.lang.Math.random;
import java.util.Scanner;



public class RockPaperScissors2 {
   


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        
        String[] choices = new String[3];
        choices[0] = "paper";
        choices[1] = "scissors";
        choices[2] = "rock";

        boolean again = false;
        do {
            // random index (for the computer)
            int rand = (int) (random() * 3);

            System.out.print("Enter your choice (paper/scissors/rock): ");
            String input = in.nextLine();
            System.out.printf("The computer choice is: %s\n", choices[rand]);
            int idx = rand;
            for (int i = 0; i < 3; i++) {
                if(i == rand) continue;
                if(compareStrings(input,choices[i])) idx = i;
            }
            if(rand-idx==-1||rand-idx==2)
            { 
                System.out.println("The player wins");
            int a = (int) (Math.random()*10);
            int b = (int) (Math.random()*10);
           int sum = Math.addExact(a , b);
           int total = 0;
             int jum = Math.addExact(total , sum) ;
     total = jum ;

            System.out.println (" Congratulation,you have won " + total + " coins! ");
}
            //generate 2 random number as the coin rewards
           
            if (rand-idx==-1||rand-idx==2){
            
            }
           
            else if (rand == idx) 
                    {
System.out.println("Tie"); again = true;
                    }
            else {System.out.println("The Computer wins");
          
                      System.out.println (" Oh no ! Try again.");
                      
                      System.out.println (" continue playing?");
                      String[] choose = new String[2];
        //create an array
        choose[0] = "yes";
        choose[1] = "no";
System.out.println (choose[0]);
System.out.println (choose[1]);
   
 String pilih = in.nextLine();
 
                 
        
    if (    "yes".equals(pilih))
    { 
System.out.println ("Let's play again");
    }
    else
    {
              System.exit(0);
    }
            }
            
                      
                     
                        
                           

                 
            
                       
            
         } while (again);
    }

   
    public static boolean compareStrings (String a, String b) {
        int sz1 = a.length(), sz2 = b.length();
        if(sz2!=sz1) return false;
        for (int i = 0; i < sz1; i++) {
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }

}
