class Triangle {
    //Pole trojkata z wysokosca i podstawa
    public Triangle(int wysokosc, int podstawa){
        System.out.println(wysokosc*podstawa/2);
    }
    //Pole trojkata z dwoma bokami oraz katem zwartym miedzy nimi
    public Triangle(int a, int b, int kat){
        System.out.println((a*b)/2*Math.sin(kat));
    }
    //Pole trojkata z wszystkimi bokami oraz z promieniem
    public Triangle(int a, int b, int c, int promien){
        System.out.println((a*b*c)/(4*promien));
    }
}
