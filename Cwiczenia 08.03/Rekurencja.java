class Rekurencja{
    public static void main(String [] args){
        //rekurencja(5);
        System.out.println(sumaDwochNajwiekszychLiczb(5, 6, 3));
        int wartosc = sumaDwochNajwiekszychLiczb(5, 6, 3);
        System.out.println(wartosc);
        System.out.println(sumaDwochNajwiekszychLiczb(5, 6, 6));
    }
    private static int zwracamJedynke(){
        return 1;
    }
    private static String zwracamStringa(){
        return "Zwracam Stringa";
    }
    private static int zwracammPotegeWprowadzonejLiczby(int liczba){
        return liczba*liczba;
    }
    private static int sumaDwochNajwiekszychLiczb(int a,int b,int c){
        int suma = 0;
        if(a>b && b>c){
            suma = a+b;
        }else if(a>b && c>b){
            suma = a+c;
        }else if(b>a && c>a){
            suma = b+c;
        }
        return suma;
    }
    private static int rekurencja(int i ){
        if(i>0){
            System.out.println("rekurencja");
            i--;
        }else{
            return 0;
        }
        rekurencja(i);
        return -1;
    }
}