class CwiczenieObiektowe_1{
    public static void main(String [] args){
        MojeDane md = new MojeDane("Mateusz", "Suchocki", "2PTN");
        Logowanie lg = new Logowanie();
        String login = lg.logowanie();
        System.out.println(login);
    }
}