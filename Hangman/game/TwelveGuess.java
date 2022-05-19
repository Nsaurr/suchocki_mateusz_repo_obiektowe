package game;

import game.utilities.HangmanEngine;
import game.utilities.SecureInput;
import game.utilities.HangmanGraphicsEngine;

public class TwelveGuess {
    public static void runGame() {

        //Menu początkowe
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Gra klasyczna 12 szans:");

        //Inicialziacja
        HangmanEngine game = new HangmanEngine();

        //Start gry
        String guess = "";
        boolean gameOver = false;
        int maxGuesses = 12;
        do {

            HangmanGraphicsEngine.drawHangman(maxGuesses);
            game.printGameState();
            System.out.println("Pozostałe szanse: " + maxGuesses);

            System.out.print("Podaj swoją odpowiedź: ");
            guess = SecureInput.secureString();
            if(!game.processGuess(guess)) {
                maxGuesses--;
            }

            if (maxGuesses == 0) {
                gameOver = true;
            }
            if (game.isGuessed()) {
                gameOver = true;
            }

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        } while(!gameOver);

        HangmanGraphicsEngine.drawHangman(maxGuesses);
        game.printPostGameState();
        System.out.println("\nWczyśnji klawisz żeby powrócić do menu: ");
        String returnToMenu = SecureInput.secureString();

    }
}
