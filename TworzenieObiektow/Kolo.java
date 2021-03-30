class Kolo {
    private Double liczba_pi = 3.1415;
    private Double promien_kola = 0.0;
    public Kolo(Double promien_kola){
        this.promien_kola = promien_kola;
    }
    public Double pole_kola(){
        return liczba_pi*(promien_kola*promien_kola);
    }
    public Double obwod_kola(){
        return 2*liczba_pi*promien_kola;
    }
}
