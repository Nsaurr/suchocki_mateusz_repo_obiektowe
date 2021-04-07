

class Tablica {
    public int [] tab = new int[10];
    public Tablica(){
        for(int i = 0; i<this.tab.length; i++){
            int min = -10;
            int max = 10;
            int wynik = min + (int)(Math.random() * ((max - min) + 1));
            this.tab[i] = wynik;
            System.out.println(this.tab[i]+"\n");
        }
    }
}
