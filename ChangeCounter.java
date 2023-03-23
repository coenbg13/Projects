package Week1_HW;

import java.util.Scanner;

public class ChangeCounter {
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);

        //ask user for what types of change they have and how many of each
        System.out.print("How many quarters do you have? ");
        double quarters = in.nextDouble();
        System.out.print("How many dimes do you have? ");
        double dimes = in.nextDouble();
        System.out.print("How many nickels do you have? ");
        double nickels = in.nextDouble();
        System.out.print("How many pennies do you have? ");
        double pennies = in.nextDouble();

        //Calculate the total, multiply each input by the amount each coin is worth. divide by 100 to get the amount in dollars
        double total = ((quarters*25) + (dimes*10) + (nickels*5) + pennies)/100;
        //display the amount
        System.out.println("Your total change is: " + "$" + total);
        
        in.close();
    }
    
}
