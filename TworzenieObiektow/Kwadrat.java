class Kwadrat {
    private int bok = 0;
    public Kwadrat(int bok){
        this.bok = bok;
    }
    public int pole_kwadratu(){
        return bok*bok;
    }
    public int obwod_kwadratu(){
        return bok*4;
    }
}
