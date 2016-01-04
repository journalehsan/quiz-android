package io.gityub.journalegsa.quiz_android;

public class Question {
    private int ID;
    private String strQuestion;
    private String radioOptionA;
    private String radioOptionB;
    private String radioOptionC;
    private String strAnswer;
    public Question()
    {
        ID=0;
        strQuestion="";
        radioOptionA="";
        radioOptionB="";
        radioOptionC="";
        strAnswer="";
    }
    public Question(String classQuestion, String classOptionA, String classOptionB, String classOptionC,
                    String classAnswer) {

        strQuestion = classQuestion;
        radioOptionA = classOptionA;
        radioOptionB = classOptionB;
        radioOptionC = classOptionC;
        strAnswer = classAnswer;
    }
    public int getID()
    {
        return ID;
    }
    public String getQuestion() {
        return strQuestion;
    }
    public String getOptionA() {
        return radioOptionA;
    }
    public String getOptionB() {
        return radioOptionB;
    }
    public String getOptionC() {
        return radioOptionC;
    }
    public String getAnswer() {
        return strAnswer;
    }
    public void setID(int id)
    {
        ID=id;
    }
    public void setQuestion(String classQuestion) {
        strQuestion = classQuestion;
    }
    public void setOptionA(String classOptionA) {
        radioOptionA = classOptionA;
    }
    public void setOptionB(String classOptionB) {
        radioOptionB = classOptionB;
    }
    public void setOptionC(String classOptionC) {
        radioOptionC = classOptionC;
    }
    public void setAnswer(String classAnswer) {
        strAnswer = classAnswer;
    }

}
