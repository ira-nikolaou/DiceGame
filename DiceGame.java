
public class DiceGame
{
    public static void main (String[] args){

        // Declare an array of 12 rolls and variables
        int [] rolledNumbers = new int [12];
        int n;
        int noOfRolls = 12;

        // Declare a boolean array to check if all numbers have been rolled and variables, intitialized to false by default
        boolean winner;

        //Create a new dice
        DiceClass rollerOne = new DiceClass();

        do {
            winner = true;
            boolean [] numbersCheck = new boolean [6];

            // roll the dice 12 times within the array
            for (n = 0; n < noOfRolls; n++){
                rollerOne.rollDice();
                rolledNumbers[n] = rollerOne.reportDice(); 
                System.out.println(rolledNumbers[n]);

                numbersCheck[(rolledNumbers[n]-1)] = true;
            }

            //check if all numbers have been rolled
            for (n = 0; n < 6; n++) {
                if (numbersCheck[n] == false) {
                    winner = false;
                }
            } 
            
            // end loop once all numbers have been rolled
        } while (winner == false); 

        //Declare winner 
        System.out.println("You are a Winner!");
        
        
        /* TASK 2
         *
        //Create two new instances of the DiceClass
        DiceClass diceOne = new DiceClass(); 
        DiceClass diceTwo = new DiceClass();

        //
        do {
        //Roll both dice
        diceOne.rollDice();
        diceTwo.rollDice();

        //return the value of both dice
        System.out.println("Your first dice rolled the number " + diceOne.reportDice()); 
        System.out.println("Your second dice rolled the number " + diceTwo.reportDice()); 
        
        //repeat until both dice have the same value
        } while (diceOne.reportDice() != diceTwo.reportDice()); 

        //Print out Winner status once dice value matches
        System.out.println("You're a winner!"); 
        ______
        TASK 1 
        //Check if the rolled number is greater then 3, and report the result
        if (diceOne.reportDice() > 3) {
        System.out.println("You have rolled the number " + diceOne.reportDice() + ", \nthis number is greater than 3!"); 

        } else {
        System.out.println("You have rolled the number " + diceOne.reportDice()); 
        }

         */
    }
}
