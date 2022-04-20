
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Punkty {
    private int pointsPlayer1 = 0;
    private int pointsPlayer2 = 0;
    private int pointsPlayer3 = 0;
    private int pointsPlayer4 = 0;
    private int maxPlayers;
    void checkWinner(){
        String[] players = {pointsPlayer1+"-1", pointsPlayer2+"-2", pointsPlayer3+"-3", pointsPlayer4+"-4"};
        Arrays.sort(players, Collections.reverseOrder());
        String res = "======= Punktacja =======\n";
        for(int i=0; i<4; i++) {
            String[] arr = players[i].split("-");
            if(maxPlayers == 2 && !(Integer.parseInt(arr[1]) == 4) && !(Integer.parseInt(arr[1]) == 3)) {
                res += "Gracz "+arr[1]+": "+arr[0]+"\n";
            } else if(maxPlayers == 3 && !(Integer.parseInt(arr[1]) == 4)) {
                res += "Gracz "+arr[1]+": "+arr[0]+"\n";
            } else if(maxPlayers == 4) {
                res += "Gracz "+arr[1]+": "+arr[0]+"\n";
            }
        }
        System.out.println(res);;
    }
    void addPoint(int playerNumber, int maxPlayers, String dificullty) {
        this.maxPlayers = maxPlayers;
        if(playerNumber == 1){
            if(dificullty.equals("łatwe")){
                pointsPlayer1++;
            }else if(dificullty.equals("średnie")){
                pointsPlayer1 += 2;
            }else{
                pointsPlayer1 += 3;
            }

        }
        else if(playerNumber == 2){
            if(dificullty.equals("łatwe")){
                pointsPlayer2++;
            }else if(dificullty.equals("średnie")){
                pointsPlayer2 += 2;
            }else{
                pointsPlayer2 += 3;
            }        }
        else if(playerNumber == 3){
            if(dificullty.equals("łatwe")){
                pointsPlayer3++;
            }else if(dificullty.equals("średnie")){
                pointsPlayer3 += 2;
            }else{
                pointsPlayer3 += 3;
            }
        }
        else if(playerNumber == 4){
            if(dificullty.equals("łatwe")){
                pointsPlayer4++;
            }else if(dificullty.equals("średnie")){
                pointsPlayer4 += 2;
            }else{
                pointsPlayer4 += 3;
            }
        }
    }
    void SongPlayer(String songName){
        try{
            File musicPath = new File(songName);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();     }

    }
}