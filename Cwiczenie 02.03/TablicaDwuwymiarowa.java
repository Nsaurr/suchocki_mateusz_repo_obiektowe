class TablicaDwuwymiarowa{
    public static void main(String [] args){
        tablica2x2();
    }

    private static void tablica2x2(){
        int a = 1;
        int [][] tab2x2 = new int [2][2];
        for(int i = 0; i<tab2x2.length; i++){
            for(int j = 0; j<tab2x2[i].length; j++){
                tab2x2[i][j] = a;
                System.out.println(tab2x2[i][j]);
                a++;
            }
        }
    }
    private static void przypomnienieTablicJednowymiarowych(){
        int [] tab =  new int [5];
        tab[0] = 40;
        int [][] tab2d = new int[5][2];
        tab2d[0][1] = 50;
        tab2d[2][1] = -200;
        tab2d[4][0] = 444;
        //System.out.println(tab2d.length);
        //System.out.println(tab2d.length*tab2d[0].length);
        for(int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
                System.out.println(tab2d[i][j]);
            }
        }
        tab =  new int [5];
        tab[0] = 40;
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}