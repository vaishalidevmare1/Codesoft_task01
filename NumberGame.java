import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);                              
      Random random = new Random();                                    
      int maxAttempts = 10;// maximum attempts per round
      int score = 0;
      System.out.println("Welcome to the Number game!");

    while(true){
        int secretNumber = random.nextInt(100) + 1; //Random number in the range 1-100
        int attempts = 0;

        System.out.println("Round" + (score +1));
        System.out.println("I have selected a number between 1 and 100. You have " + maxAttempts + " attempts");

    while(attempts<maxAttempts){
        System.out.println("Enter your guess:");                              
        int userGuess = scanner.nextInt();
        attempts++;

    if(userGuess == secretNumber){
        System.out.println("Congratulations! You gussed the correct number in" +attempts+"attempts");
        score +=maxAttempts - attempts +1;
        break;    
    }else if(userGuess<secretNumber){
       System.out.println("Try a higher number.Attempts left: " + (maxAttempts-attempts)); 
    }else{
        System.out.println("Try a lower number.Attempts left: " + (maxAttempts-attempts));
    }
      }
    if(attempts == maxAttempts){
        System.out.println("You have run out of attempts. The corect number was " +secretNumber + "");
    }
     System.out.println("Do you want to play another round? (Yes/No): ");
     String PlayAgain =scanner.next();
     if(!PlayAgain.equalsIgnoreCase("Yes")){
        System.out.println("Thanks for playing your total score is" +score);
        break;
     }
      }
      scanner.close();
    }
}
