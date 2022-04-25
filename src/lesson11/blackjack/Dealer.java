package lesson11.blackjack;

public class Dealer extends Player implements IDealer{


    public Dealer() {
        super("Boss");
    }

    @Override
    public boolean needMoreCards() {
        if (countValuesHand() < 18 ){
            return true;
        }
        return false;
    }
}
