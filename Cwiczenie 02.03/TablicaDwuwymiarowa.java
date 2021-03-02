class TablicaDwuwymiarowa{
    public static void main(String [] args){
        tabliczkamnozenia();
    }
    
    private static void tabliczkamnozenia(){
        int a = 1;
        int [][] tab10 = new int [10][10];
        for(int i = 0; i<tab10.length; i++){
            for(int j = 0; j<tab10[i].length; j++){
                tab10[i][j] = (i+1)*(j+1);
            }
        }
        for(int i = 0; i<tab10.length; i++){
            for(int j = 0; j<tab10[i].length; j++){
                tab10[i][j] = a;
                System.out.println(tab10[i][j]+"\t");
                a++;
            }
            System.out.println();
        }
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