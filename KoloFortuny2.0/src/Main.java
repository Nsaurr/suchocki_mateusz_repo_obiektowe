import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Punkty punkty = new Punkty();
        punkty.SongPlayer("theme.wav");
        System.out.println("=============== Koło Fortuny ===============");
        //wybieranie ilosci graczy
        System.out.print("Wybierz ilość graczy [2-4]: ");
        int numberOfPlayers = sc.nextInt();
        while(numberOfPlayers < 2 || numberOfPlayers > 4 ) {
            System.out.println("Niepoprawny zakres!");
            System.out.print("Wybierz ilość graczy [2-4]: ");
            numberOfPlayers = sc.nextInt();
        }
        //wybieranie ilosci rund
        System.out.print("Wybierz ilość rund [2-20]: ");
        int numberOfRounds = sc.nextInt();
        while(numberOfRounds < 2 || numberOfRounds > 20 ) {
            System.out.println("Niepoprawny zakres!");
            System.out.print("Wybierz ilość  rund [4-20]: ");
            numberOfRounds = sc.nextInt();
        }
        //generowianie losowych liczb bez powtarzania
        int questionsAmount = numberOfRounds * numberOfPlayers;
        Random r = new Random();
        Set set = new HashSet();
        for (int i = 0; i < questionsAmount; i++) {
            int setLength = set.size();
            while (setLength == set.size()) {
                int rNumb = r.nextInt(90);//losowanie do 90
                set.add(rNumb);
            }
        }
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.addAll(set);
        File f = new File("pytania.txt");
        int random = 1;
        for (int i = 0; i < questionsAmount; i += numberOfPlayers) {
            List<String> data = new ArrayList<>();
            try {
                Scanner scFile = new Scanner(f);
                while (scFile.hasNextLine()) {
                    String line = scFile.nextLine();
                    data.add(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (int j = 0; j < numberOfPlayers; j++) {
                Scanner sc3 = new Scanner(System.in);
                Pytania question = new Pytania(data.get(randomNumbers.get(i + j)));
                System.out.println("===================================================");
                System.out.println("||        **** Numer rundy:"+random+" ****         ");
                System.out.println("|| Pytanie dla gracza:"+(j+1)+"                    ");
                System.out.println("|| Trudność: "+question.getDifficulty()+"          ");
                System.out.println("|| Kategoria: "+question.getCategory()+"           ");
                System.out.println("|| Pytanie: "+question.getQuestion()+"             ");
                System.out.println("|| Odpowiedz A: "+question.getAnswerA()+"          ");
                System.out.println("|| Odpowiedz B: "+question.getAnswerB()+"          ");
                System.out.println("|| Odpowiedz C: "+question.getAnswerC()+"          ");
                System.out.println("|| Odpowiedz D: "+question.getAnswerD()+"          ");
                System.out.println("===================================================");
                System.out.print("\nTwoja odpowiedź: ");
                String answer = sc3.nextLine();
                if(question.isCorrect(answer)) {
                    punkty.addPoint(j+1, numberOfPlayers,question.getDifficulty());
                    System.out.println("Podałeś poprawną odpowiedź!");
                } else System.out.println("Nie podałeś poprawnej odpowiedzi!");
                System.out.print("\n");
            }
            random++;
        }
        int wybor = 0;
        punkty.addPoint(5, numberOfPlayers,"");
        punkty.checkWinner();
        while (wybor!=1){
            System.out.println("Jeśli zapoznałeś się z tablicą wyników wciśnij jeden: ");
            wybor = sc.nextInt();
        }
        System.exit(0);
    }
}