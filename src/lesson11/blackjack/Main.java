package lesson11.blackjack;

public class Main {

    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();

        Player player1 = new Player("misha");
        Player player2 = new Player("ksusha");

        Dealer dealer = new Dealer();

        blackJack.addPlayer(player1);
        blackJack.addPlayer(player2);

        blackJack.addPlayer(dealer);

        blackJack.dealTwoCards();
        blackJack.dealAllCards();
        blackJack.printWinner();
    }
}
