package game.utilities;

import java.util.Scanner;

public class SecureInput {

    //Tylko integer
    public static int secureInt() {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        boolean complete = false;
        do {
            try {
                userInput = input.nextInt();
                complete = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Proszę podać cyfrę");
                input.nextLine();
            }
        } while (!complete);
        return userInput;
    }

    //Tylko jedno słowo
    public static String secureString() {
        Scanner input = new Scanner(System.in);
        String word = "";
        boolean complete = false;
        do {
            if(input.hasNext()) {
                word = input.next();
                input.nextLine();
                if(stringCharacterCheck(word)) {
                    complete = true;
                }
                else {
                    System.out.println("Podaj literę lub słowo");
                }
            }
            else {
                System.out.println("Nieprawidłowa odpowiedź");
            }
        } while(!complete);
        word = word.toUpperCase();
        return word;
    }

    //Tylko jedna litera
    public static String secureStringChar() {
        Scanner input = new Scanner(System.in);
        String character = "";
        boolean complete = false;
        do {
            if (input.hasNext()) {
                character = input.next();
                input.nextLine();
                if (stringCharacterCheck(character)) {
                    if (character.length() == 1) {
                        complete = true;
                    }
                    else {
                        System.out.println("Podaj tylko jedną literę ");
                    }
                }
                else {
                    System.out.println("Podaj literę");
                }
            }
            else {
                System.out.println("Nieprawidłowa odpowied");
            }
        } while (!complete);
        character = character.toUpperCase();
        return character;
    }

    //Sprawdza czy strig ma tylko litery
    private static boolean stringCharacterCheck(String str) {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

}
