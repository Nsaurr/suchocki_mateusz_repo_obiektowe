class ImieNazwisko {
    private String imie = "";
    private String nazwisko = "";
    public ImieNazwisko(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String witaj(){
        return ("Witaj "+imie+" "+nazwisko);
    }
}
