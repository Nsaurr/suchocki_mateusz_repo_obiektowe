import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
class Zad1{
    public static void main(String [] arg){
        File f = new File("uczniowie.txt");
        Random r = new Random();
        int [] ocena = new int[10];
        String [] uczniowie = new String[10];
        try{
            Scanner sc = new Scanner(f);
            int i = 0;
            while(sc.hasNext()){
                uczniowie[i] = sc.nextLine();
                i++;
            }
            for(i=0;i<10;i++){
                ocena[i] = r.nextInt(6)+1;
                System.out.println(uczniowie[i]+" -----> "+ocena[i]);
            }
        }catch(FileNotFoundException ex){
            System.out.println("Blad: "+ex.toString());
        }

    }
}