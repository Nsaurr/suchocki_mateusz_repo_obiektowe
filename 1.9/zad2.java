import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.io.FileNotFoundException;
class zad2 {
    public static void main(String [] arg){
        File flos = new File("czylosowac.txt");
        File file = new File("ileliczb.txt");
        Random r = new Random();
        try{
            Scanner sclos = new Scanner(flos);
            Scanner scile = new Scanner(file);
            String [] tablos = sclos.nextLine().split(" ");
            String [] tabile = new String[tablos.length];
            int i = 0;
            while(scile.hasNext()){
                tabile[i] = scile.nextLine();
                i++;
            }
            for(i=0; i<tablos.length; i++){
                if(tablos[i].equals("0")){
                    System.out.println("Wczytalem liczbe 0 – nie losuje liczby");
                }for(int a=0; a<Integer.parseInt(tabile[i]); a++){
                    System.out.print(r.nextInt(80)+1);
                    System.out.print("\n");
                }
            }
        }catch(FileNotFoundException ex){
            System.out.println("Blad: "+ex.toString());
        }
    }
}