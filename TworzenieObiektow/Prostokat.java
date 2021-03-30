class Prostokat {
    private int bok1 = 0;
    private int bok2 = 0;
    public Prostokat(int bok1, int bok2){
        this.bok1 = bok1;
        this.bok2 = bok2;
    }
    public int pole_prostokata(){
        return bok1 * bok2;
    }
    public int obwod_prostokata(){
        return 2*bok1 + 2*bok2;
    }
}
