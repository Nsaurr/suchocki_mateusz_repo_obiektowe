import javax.lang.model.util.ElementScanner14;

class SuchockiMateusz{
    public static void main(String [] args){
        Sprawdzian sp = new Sprawdzian();
        sp.ocena = 5;
        sp.data = "2021-04-07";
        sp.nazwa_przedmiotu = "PROGRAMOWANIE OBIEKTOWE";
        System.out.println("Wynik: \n"+sp.data+"\n"+sp.ocena+"\n"+sp.nazwa_przedmiotu);
        Dane da = new Dane("Jan","Kowalski","2001-12-19");
        System.out.println(da.toString());
        Tablica ta1 = new Tablica();
        Tablica ta2 = new Tablica();
        for(int i=0; i<10; i++){
            if(ta1.tab[i] < ta2.tab[i]){ 
                System.out.println(ta1.tab[i]+" < "+ta2.tab[i]);
            }else if(ta1.tab[i] > ta2.tab[i]){
                System.out.println(ta1.tab[i]+" > "+ta2.tab[i]);
            }else{
                System.out.println(ta1.tab[i]+" = "+ta2.tab[i]);
            }
             
        
        }
}
}