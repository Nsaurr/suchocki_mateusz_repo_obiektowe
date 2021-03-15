class PierwszeObiektowe{
    public static void main(String [] args){
        ObiektPudelko op = new ObiektPudelko();
        System.out.println(op.wysokosc);
        op.wysokosc = 100;
        System.out.println(op.wysokosc);
        Osoba os = new Osoba();
        System.out.println(os.imie);
        System.out.println(os.nazwisko);
    }
}