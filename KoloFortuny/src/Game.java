public class Game {
    private String player1 = "";
    private String player2 = "";
    private String player3 = "";
    private String player4 = "";
    private int players;
    private int rounds;
    private int pointsPlayer1;
    private int pointsPlayer2;
    private int pointsPlayer3;
    private int pointsPlayer4;
    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getPlayer3() {
        return player3;
    }

    public void setPlayer3(String player3) {
        this.player3 = player3;
    }

    public String getPlayer4() {
        return player4;
    }

    public void setPlayer4(String player4) {
        this.player4 = player4;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getPointsPlayer1() {
        return pointsPlayer1;
    }

    public void setPointsPlayer1(int pointsPlayer1) {
        this.pointsPlayer1 = pointsPlayer1;
    }

    public int getPointsPlayer2() {
        return pointsPlayer2;
    }

    public void setPointsPlayer2(int pointsPlayer2) {
        this.pointsPlayer2 = pointsPlayer2;
    }

    public int getPointsPlayer3() {
        return pointsPlayer3;
    }

    public void setPointsPlayer3(int pointsPlayer3) {
        this.pointsPlayer3 = pointsPlayer3;
    }

    public int getPointsPlayer4() {
        return pointsPlayer4;
    }

    public void setPointsPlayer4(int pointsPlayer4) {
        this.pointsPlayer4 = pointsPlayer4;
    }

    public void checkWinner(){
        if(players == 2){
            if(pointsPlayer1>pointsPlayer2){
                System.out.println("Wygral gracz o nazwie: "+player1);
            }else{
                System.out.println("Wygral gracz o nazwie: "+player2);
            }
        }else if(players == 3){
            if(pointsPlayer1>pointsPlayer2&&pointsPlayer1>pointsPlayer3){
                System.out.println("Wygral gracz o nazwie: "+player1);
            }else if(pointsPlayer2>pointsPlayer1&&pointsPlayer2>pointsPlayer3){
                System.out.println("Wygral gracz o nazwie: "+player2);
            }else{
                System.out.println("Wygral gracz o nazwie: "+player3);
            }
        }else{
            if(pointsPlayer1>pointsPlayer2&&pointsPlayer1>pointsPlayer3&&pointsPlayer1>pointsPlayer4){
                System.out.println("Wygral gracz o nazwie: "+player1);
            }else if(pointsPlayer2>pointsPlayer1&&pointsPlayer2>pointsPlayer3&&pointsPlayer2>pointsPlayer4){
                System.out.println("Wygral gracz o nazwie: "+player2);
            }else if(pointsPlayer3>pointsPlayer1&&pointsPlayer3>pointsPlayer2&&pointsPlayer3>pointsPlayer4){
                System.out.println("Wygral gracz o nazwie: "+player3);
            }else{
                System.out.println("Wygral gracz o nazwie: "+player4);
            }
        }
    }
}
