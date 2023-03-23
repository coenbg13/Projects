package Week1_HW;

public class DiceRoller {
    public static void main(String[] args) {
        //Dice roller 
        int dice1 = (int) (Math.random()*6 +1);//establish the first roll and give it a variable
        int dice2 = (int) (Math.random()*6 +1);//establish the second roll and give it a variable

        System.out.println("The first die comes up: " + dice1);//state the first roll
        System.out.println("The second die comes up: " + dice2);//state the second roll
        System.out.println("The total roll is: " + (dice1 + dice2));//state the sum of both rolls
        
        
    }
    
}
