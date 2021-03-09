class Rekurencja2 {
    public static void main(String [] args){
        long liczba = obliczanieSilni(14);
        System.out.println("Wynik: "+liczba);
        String wyraz = wyswietlanieWyrazu("Anna");
        System.out.println(wyraz);

    }
    private static int sumaKolejnychLiczb(int liczba){
        if(liczba>0){
            System.out.println(liczba);
            return liczba+sumaKolejnychLiczb(liczba-1);
        }
        System.out.println("Koniec rekurencji liczba ="+liczba);
        return 0;
    }
    private static long obliczanieSilni(int liczba){
        if(liczba>1){
            return liczba * obliczanieSilni(liczba-1);
        }
        return 1;
    }
    private static String wyswietlanieWyrazu(String wyraz){
        if(wyraz.length()>1){
            return wyraz + "\n" + wyswietlanieWyrazu(wyraz.substring(0, wyraz.length() - 1));
        }
        return wyraz;
    }
}
