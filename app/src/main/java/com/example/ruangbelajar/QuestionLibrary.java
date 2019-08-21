package com.example.ruangbelajar;

public class QuestionLibrary {
    private String mQuestions [] = {
            "Pilihlah Molekul Unsur!",
            "Pilihlah Molekul Senyawa!",
            "Pilihlah Molekul Unsur!",
            "Pilihlah Molekul Senyawa!",
            "Pilihlah Molekul Senyawa!",
    };
    private String mChoices [][] = {
            {"Raksa","Air","Garam"},
            {"Raksa","Air","Besi"},
            {"Seng","Amonia","Silika"},
            {"Raksa","Metana","Helium"},
            {"Raksa","Metana","Helium"},
    };
    private String mCorrectAnswers[] = {"Raksa","Air","Seng","Metana","Metana"};

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice (int a) {
        String choice0 = mChoices[a] [0];
        return choice0;
    }
    public String getChoice2 (int a) {
        String choice1 = mChoices[a] [1];
        return choice1;
    }
    public String getChoice3 (int a) {
        String choice2 = mChoices[a] [2];
        return choice2;
    }
    public String getChoice4 (int a) {
        String choice3 = mChoices[a] [3];
        return choice3;
    }
    public String getChoice5 (int a) {
        String choice4 = mChoices[a] [4];
        return choice4;
    }
    public String getCorrectAnswer(int a) {
    String answer = mCorrectAnswers[a];
    return answer;
    }

}
