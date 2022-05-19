import game.Classic;
import game.Unlimited;
import game.TwelveGuess;

//Inne importy
import game.utilities.SecureInput;
import game.utilities.WordManager;

public class Hangman {

    //Menu główne
    public static void main(String[] args) {
        boolean closeMenu = false;
        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("=====================================");
            System.out.println("           Hangman: Menu główne      ");
            System.out.println("-------------------------------------");
            System.out.println("            P - Zagraj w grę         ");
            System.out.println("           M - Zarządzaj słowami     ");
            System.out.println("              A - Autor               ");
            System.out.println("              E - Wyjdź              ");
            System.out.println("=====================================");
            System.out.print("Wybierz: ");
            String input = SecureInput.secureStringChar();
            switch (input) {
                case "P":
                    gameModeMenu();
                    break;
                case "M":
                    manageWordsMenu();
                    break;
                case "A":
                    gameAuthor();
                    break;
                case "E":
                    System.out.println("Wychodzenie...");
                    closeMenu = true;
                    break;
                default:
                    System.out.println("Brak takiej opcji!!!");
                    break;
            }
        } while(!closeMenu);
    }

    //Zarządzanie słowami
    private static void manageWordsMenu() {
        boolean closeMenu = false;
        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("=====================================");
            System.out.println("     Hangman: Zarządzaj słowami      ");
            System.out.println("-------------------------------------");
            System.out.println("   Słowa mogą być edytowane również: ");
            System.out.println("   game/utilities/5.0_wisielec.txt   ");
            System.out.println("-------------------------------------");
            System.out.println("            A - Dodaj słowa           ");
            System.out.println("           V - Wyświetl słowa         ");
            System.out.println("              B - Cofnji              ");
            System.out.println("=====================================");
            System.out.print("Wybierz: ");
            String input = SecureInput.secureStringChar();
            switch (input) {
                case "A":
                    System.out.println("Podaj słowo: ");
                    WordManager.addWord(SecureInput.secureString());
                    break;
                case "V":
                    WordManager.listWords();
                    System.out.println("Wpisz literę aby powrócić do menu: ");
                    String goBack = SecureInput.secureString();
                    break;
                case "B":
                    closeMenu = true;
                    break;
                default:
                    System.out.println("Spróbuj ponownie");
                    break;
            }
        } while(!closeMenu);
    }

    //Menu wyboru trybu
    private static void gameModeMenu() {
        boolean closeMenu = false;
        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("=====================================");
            System.out.println("           Hangman: Tryby gry        ");
            System.out.println("-------------------------------------");
            System.out.println("        1 - Klasyczny (6 szans)       ");
            System.out.println("        2 - Klasyczny (12 szans)      ");
            System.out.println("        3 - Nieskonczone szansy       ");
                                //KROK 1: Dodaj tu nowy tryb
                                //KROK 2: Linijka ~113
            System.out.println("              0 - Cofnji               ");
            System.out.println("=====================================");
            System.out.print("Wybierz: ");
            int input = SecureInput.secureInt();
            switch (input) {
                case 1:
                    Classic.runGame();
                    closeMenu = true;
                    break;
                case 2:
                    TwelveGuess.runGame();
                    closeMenu = true;
                    break;
                case 3:
                    Unlimited.runGame();
                    closeMenu = true;
                    break;
                //KROK 3: Dodaj nowe tryby
                case 0:
                    closeMenu = true;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji!!!");
            }
        } while(!closeMenu);
    }
    //Menu o autorze
    private static void gameAuthor() {
        boolean closeMenu = false;
        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("=====================================");
            System.out.println("           Hangman: Autor             ");
            System.out.println("-------------------------------------");
            System.out.println("         Mateusz Suchocki 3PTN       ");
            System.out.println("              0 - Cofnji              ");
            System.out.println("=====================================");
            System.out.print("Wybierz: ");
            int input = SecureInput.secureInt();
            switch (input) {
                default:
                    closeMenu = true;
                    break;
            }
        } while(!closeMenu);
    }
}