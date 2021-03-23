class MojeBmi {
    private int waga = 0;
    private int wzrost = 0;

    public MojeBmi(int wzrost, int waga){
        System.out.println(wzrost+" "+waga);
        this.wzrost  = wzrost;
        this.waga = waga;
    }
    public double mojeBmi(){
        return waga/((double)wzrost/100*wzrost/100);
    }
}
