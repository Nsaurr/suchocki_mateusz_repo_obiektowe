import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Categories imp = new Categories();
        Random r = new Random();
        int randomInt;
        int stop = 0;
        int wybor = 0;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        System.out.println("Podaj ilosc graczy[2-4]: ");
        game.setPlayers(sc.nextInt());
        System.out.println("Podaj ilosc rund: ");
        game.setRounds(sc.nextInt());
        if (game.getPlayers() == 2) {
            System.out.println("Podaj nazwe pierszwego gracza: ");
            game.setPlayer1(sc.next());
            System.out.println("Podaj nazwe drugiego gracza: ");
            game.setPlayer2(sc.next());
        } else if (game.getPlayers() == 3) {
            System.out.println("Podaj nazwe pierszwego gracza: ");
            game.setPlayer1(sc.next());
            System.out.println("Podaj nazwe drugiego gracza: ");
            game.setPlayer2(sc.next());
            System.out.println("Podaj nazwe trzeciego gracza: ");
            game.setPlayer3(sc.next());
        } else if (game.getPlayers() == 4) {
            System.out.println("Podaj nazwe pierszwego gracza: ");
            game.setPlayer1(sc.next());
            System.out.println("Podaj nazwe drugiego gracza: ");
            game.setPlayer2(sc.next());
            System.out.println("Podaj nazwe trzeciego gracza: ");
            game.setPlayer3(sc.next());
            System.out.println("Podaj nazwe czwartego gracza: ");
            game.setPlayer4(sc.next());
        } else {
            System.out.println("Liczba graczy spoza zakresu!!");
            System.exit(0);
        }
        for (int i = 0; i < game.getRounds(); i++) {
            randomInt = r.nextInt(10) + 1;
            switch (randomInt) {
                case 1 ->{
                    imp.setOption(1);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie samochody prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 2 ->{
                    imp.setOption(2);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie ptaki prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 3 ->{
                    imp.setOption(3);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie rzeki swiata prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 4 ->{
                    imp.setOption(4);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie stolice europy prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 5 ->{
                    imp.setOption(5);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie Stany Zjednoczone prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 6 -> {
                    imp.setOption(6);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie waluty europejskie  prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 7 ->{
                    imp.setOption(7);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie waluty swiata prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 8 ->{
                    imp.setOption(8);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie religie swiata prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 9 ->{
                    imp.setOption(9);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie kultowe Polskie komedie prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
                case 10 ->{
                    imp.setOption(10);
                    wybor = 0;
                    stop = 0;
                    x = 0;
                    System.out.println("Wylosowano kategorie wodospady prosze wybrac trudnosc pytania 1-3");
                    imp.setDifficulty(sc.nextInt());
                    imp.pytanie();
                    System.out.println(imp.getPytanie()+"\n"+imp.getOdp1()+"\n"+imp.getOdp2()+"\n"+imp.getOdp3()+"\n"+imp.getOdp4());
                    String odp[] = imp.getPoprawanaOdp().split(":");
                    String poprawnaodp = odp[1];
                    while (stop!=1){
                        x++;
                        if (game.getPlayers()==2){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }

                        }else if(game.getPlayers()==3){
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }else{
                            wybor = sc.nextInt();
                            if(x==1 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer1());
                                int punkty = game.getPointsPlayer1();
                                punkty += 1;
                                game.setPointsPlayer1(punkty);
                                stop = 1;
                            }else if(x==2 && String.valueOf(wybor).equals(poprawnaodp)){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer2());
                                int punkty = game.getPointsPlayer2();
                                punkty += 1;
                                game.setPointsPlayer2(punkty);
                                stop = 1;
                            }else if(x==3){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer3());
                                int punkty = game.getPointsPlayer3();
                                punkty += 1;
                                game.setPointsPlayer3(punkty);
                                stop = 1;
                            }else if(x==4){
                                System.out.println("Poprawna odp podal gracz o nazwie: "+game.getPlayer4());
                                int punkty = game.getPointsPlayer4();
                                punkty += 1;
                                game.setPointsPlayer4(punkty);
                                stop = 1;
                            }else if(x==5){
                                System.out.println("Zaden z graczy nie podal poprawnej odp");
                                stop = 1;
                            }
                        }
                    }
                }
            }
        }
        game.checkWinner();
    }
}
