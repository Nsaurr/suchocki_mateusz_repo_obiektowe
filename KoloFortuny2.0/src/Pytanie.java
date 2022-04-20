public class Pytanie {
    protected String odpA = "";
    protected String odpB = "";
    protected String odpC = "";
    protected String odpD = "";
    protected String question = "";
    protected String category = "";
    protected String difficulty = "";
    protected String correctAnswer = "";
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswerA() {
        return odpA;
    }
    public void setAnswerA(String answerA) {
        this.odpA = answerA;
    }
    public String getAnswerB() {
        return odpB;
    }
    public void setAnswerB(String answerB) {
        this.odpB = answerB;
    }
    public String getAnswerC() {
        return odpC;
    }
    public void setAnswerC(String answerC) {
        this.odpC = answerC;
    }
    public String getAnswerD() {
        return odpD;
    }
    public void setAnswerD(String answerD) {
        this.odpD = answerD;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}