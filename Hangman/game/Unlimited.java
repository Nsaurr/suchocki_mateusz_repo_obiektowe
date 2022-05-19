package game;

import game.utilities.HangmanEngine;
import game.utilities.SecureInput;

public class Unlimited {
    public static void runGame(){

        //Menu początkowe
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Nieskonczony:");

        //Inicialziacja
        HangmanEngine game = new HangmanEngine();

        //Start gry
        String guess = "";
        boolean gameOver = false;
        do {

            game.printGameState();

            System.out.print("Podaj swoją odpowiedź: ");
            guess = SecureInput.secureStringChar();
            game.processGuess(guess);

            gameOver = game.isGuessed();

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        } while(!gameOver);

        game.printPostGameState();

    }
}
