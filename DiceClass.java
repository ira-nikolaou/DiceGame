import java.lang.Math; 

public class DiceClass
{
    int faceUp; 

    public void rollDice() {
        faceUp = (int) (Math.random() * 6 + 1);
    }

    public int reportDice() { 
        return faceUp;
    }
}
