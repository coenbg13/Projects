package Project1;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Generate random number betwen 1-100
        int randomNumber = (int) (Math.random()*100) +1; 
        //Math.random() gives a number from 0 to 1 but not including 1 So you multiply by 100 to get up to 99 then add 1 for 100
        
        //prompt the user to guess the number
        System.out.print("Enter guess: ");
        int userGuess = input.nextInt();


        //check users number, deterimine high low or correct
        while(userGuess != randomNumber){
            if(userGuess > randomNumber) System.out.println("Too high");
            else System.out.println("Too low");
            //read next guess
            System.out.print("Enter next guess: ");
            userGuess = input.nextInt();
        }
        
        //only get here when the users has the correct answer, display "Congratulations!"
        if (userGuess == randomNumber){
            System.out.println("Contratulations you got it!");
        
        }

        input.close();

    }
}
