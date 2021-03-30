class CwiczenieObiektowe_1{
    public static void main(String [] args){
        MojeDane md = new MojeDane("Mateusz", "Suchocki", "2PTN");
        Logowanie lg = new Logowanie();
        String login = lg.logowanie();
        System.out.println(login);
        Double k1 = 4.0;
        Double k2 = 20.0;
        Kolo kl = new Kolo(k1);
        Kolo kl2 = new Kolo(k2);
        System.out.println("Pole: "+kl.pole_kola()+"\nObwod kola: "+kl.obwod_kola());
        System.out.println("Pole: "+kl2.pole_kola()+"\nObwod kola: "+kl2.obwod_kola());
    }
}