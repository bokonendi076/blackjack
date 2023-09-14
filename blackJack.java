import java.util.Scanner;
import java.util.Random;


public class blackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playerTurn = true;

        while (true) {
            int playerTotal = 0;
            int opponentTotal = 0;

            playerTotal +=  new Random().nextInt(11) + 1;
            playerTotal +=  new Random().nextInt(11) + 1;

            System.out.println("Welkom bij blackjack! Dit is je startgetal:" + playerTotal);

            // beurt van de speler
            while (playerTurn) {
                System.out.println("Wil je nog een getal? j/n");
                String choice = scanner.nextLine();

                if (choice.equals("j")) {
                    int randomNumber = new Random().nextInt(11) + 1;
                    playerTotal += randomNumber;

                    System.out.println("Nieuw nummer: " + randomNumber);
                    System.out.println("Je totaal aantal punten is nu: " + playerTotal);
                     
                } else if (choice.equals("n")) {
                    playerTurn = false;
                } else {
                    System.out.println("Onjuiste keuze. Voer 'j' in voor ja en 'n' als je nee bedoeld.");
                }
            }

            opponentTotal += new Random().nextInt(24) + 16;
            System.out.println("Tegenstander heeft een totaal aantal punten van: " + opponentTotal);

            if (opponentTotal > 21 || (opponentTotal < playerTotal && playerTotal <= 21)) {
                System.out.println("Gefeliciteerd! Je wint!");
            } else {
                System.out.println("Tegenstander wint. Probeer het opnieuw.");
            }

            System.out.print("Wil je nog een keer spelen? (j/n): ");
            char playAgain = scanner.next().charAt(0);
            if (playAgain != 'j') {
                System.out.println("Bedankt voor het spelen!");
                break;
            }

        }

    }
    
}
