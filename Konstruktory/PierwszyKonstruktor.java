class PierwszyKonstruktor{
    public static void main(String [] args){
        MojeBmi mb = new MojeBmi(190, 86);
        ImieNazwisko in = new ImieNazwisko("Mateusz", "Suchocki");
        //System.out.println("2."+mb.wzrost+" "+mb.waga);
        double wynik = mb.mojeBmi();
        System.out.println("BMI= "+wynik);
        //System.out.println("ImieNazwisko. "+in.imie+" "+in.nazwisko);
        String przywitanie = in.witaj();
        System.out.println(przywitanie);
    }
}