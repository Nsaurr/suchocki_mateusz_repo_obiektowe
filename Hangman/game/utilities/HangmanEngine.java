package game.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HangmanEngine {

    private final String[] arrayWord;
    private final int wordLength;
    private int guesses;
    private String[] correctGuesses;
    private String incorrectGuesses = "";
    private String allGuesses = "";
    private ArrayList<String> allWordGuesses;
    private String word = "";

    //Konstruktor
    public HangmanEngine() {
        arrayWord = importWord();
        wordLength = arrayWord.length;
        guesses = 0;
        correctGuesses = arrayHangmanFormatter(wordLength);
        convertArrayedWord();
        this.allWordGuesses = new ArrayList<String>();
    }

    //Metody get
    public int getGuesses() {
        return guesses;
    }
    public int getWordLength() {
        return wordLength;
    }
    public String[] getArrayWord() {
        return arrayWord;
    }
    public String[] getCorrectGuesses() {
        return correctGuesses;
    }
    public String getIncorrectGuesses() {
        return incorrectGuesses;
    }
    public String getAllGuesses() {
        return allGuesses;
    }
    public ArrayList<String> getAllWordGuesses() {
        return allWordGuesses;
    }
    public String getWord() {
        return word;
    }

    //Metody domyślne
    public void printGameState() {
        for (int i = 0; i < wordLength; i++) {
            System.out.print(correctGuesses[i] + " ");
        }
        System.out.print("   ");
        System.out.print("Wykorzystane litery: {" + incorrectGuesses + "}\n");
    }

    public boolean processGuess(String guess) {
        if(guess.length() == 1) {
            boolean containsGuess = arraySearcher(arrayWord, guess);
            if (allGuesses.contains(guess)) {
                System.out.println("Już odgadłeś tą literę.");
                return true;
            }
            else {
                if (containsGuess) {
                    correctGuesses = arrayReplacer(arrayWord, correctGuesses, guess);
                    guesses++;
                    allGuesses = allGuesses + guess;
                    return true;
                } else {
                    incorrectGuesses = incorrectGuesses + guess;
                    guesses++;
                    allGuesses = allGuesses + guess;
                    return false;
                }
            }
        }
        else {
            if(allWordGuesses.contains(guess)) {
                System.out.println("Już zgadłeś tę słowo.");
                return true;
            }
            else {
                if(word.equals(guess)) {
                    for(int i = 0; i < arrayWord.length; i++) {
                        correctGuesses = arrayReplacer(arrayWord, correctGuesses, arrayWord[i]);
                    }
                    guesses++;
                    allWordGuesses.add(guess);
                    return true;
                }
                else {
                    incorrectGuesses = incorrectGuesses + "\"" + guess + "\"";
                    guesses++;
                    allWordGuesses.add(guess);
                    return false;
                }
            }
        }
    }

    public boolean isGuessed() {
        boolean gameOver = true;
        for (int i = 0; i < correctGuesses.length; i++) {
            if (correctGuesses[i].equals("_")) {
                gameOver = false;
            }
        }
        return gameOver;
    }

    public void printPostGameState() {
        if(isGuessed()) {
            System.out.println("Wygrałeś!");
            for (int i = 0; i < wordLength; i++) {
                System.out.print(correctGuesses[i] + " ");
            }
            System.out.print("   ");
            System.out.print("Wykorzystane litery: {" + incorrectGuesses + "}\n");
            System.out.print("Zgadłeś słowo w " + guesses + " odpowiedziach.");
        }
        else {
            System.out.println("Przegrałeś powodzenia następnym razem");
            for (int i = 0; i < wordLength; i++) {
                System.out.print(correctGuesses[i] + " ");
            }
            System.out.print("   ");
            System.out.print("Wykorzystane litery: {" + incorrectGuesses + "}\n");
            System.out.println("Słowem było: " + word);
            System.out.print("Podałeś " + guesses + " odpowiedzi.");
        }
    }

    //Metody prywatne
    private static String[] importWord() {
        //Zaimpotruj 10 słów i wybierz jedno do gry
        ArrayList<String> allWordsList = new ArrayList<String>();
        String line = "";
        String word = "";
        try {
            //Inicalizacja file reader
            FileReader fr = new FileReader("game/utilities/5.0_wisielec.txt");
            BufferedReader br = new BufferedReader(fr);

            //Zapisywanie słów do array listy
            while((line = br.readLine()) != null) {
                allWordsList.add(line);
            }

            br.close();
        }
        catch (IOException ioe) {
            System.out.println("Brak pliku 5.0_wisielec.txt");
        }
        //Wybranie słowa i konwertowanie do drukowanych
        Random rand = new Random();
        int randomNum = rand.nextInt(allWordsList.size()) + 1;
        word = allWordsList.get(randomNum);
        word = word.toUpperCase();
        //Konwertowanie słowa do tablicu
        String[] arrayedWord = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            arrayedWord[i] = Character.toString(word.charAt(i));
        }
        return arrayedWord;
    }
    private static String[] arrayHangmanFormatter(int length) {
        //Wypełnienie tablicy z podkreślnikami do formatowania
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = "_";
        }

        return array;
    }
    private static boolean arraySearcher(String[] array, String guess) {
        //Poszukiwanie litery
        boolean containsGuess = false;
        if(Arrays.asList(array).contains(guess)) {
            containsGuess = true;
        }
        return containsGuess;
    }
    private static String[] arrayReplacer(String[] word, String[] guessingArray, String replace) {
        //Zamiana podkreślnika na podaną literę
        for(int i = 0; i < word.length; i++) {
            if(word[i].equals(replace)) {
                guessingArray[i] = replace;
            }
        }
        return guessingArray;
    }
    private void convertArrayedWord() {
        for (int i = 0; i < wordLength; i++) {
            word = word + arrayWord[i];
        }
    }

}
