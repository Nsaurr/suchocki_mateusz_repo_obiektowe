public class Pytania extends Pytanie implements PytaniaImp {
    @Override
    public boolean isCorrect(String givenAnswer) {
        if (givenAnswer.equals(correctAnswer)) {
            return true;
        } else {
            return false;
        }
    }
    public Pytania(String s) {
        String[] wartosci = s.split(";");
        this.question = wartosci[0];
        this.category = wartosci[1];
        this.odpA = wartosci[2];
        this.odpB = wartosci[3];
        this.odpC = wartosci[4];
        this.odpD = wartosci[5];
        this.correctAnswer = wartosci[6];
        this.difficulty = wartosci[7];
    }
}