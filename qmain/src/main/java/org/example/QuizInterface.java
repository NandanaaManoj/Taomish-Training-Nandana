package org.example;

interface QuizInterface {
    void showQuestion(int index);

    void showOptions(int index);

    int fetchScore();

    boolean checkAnswer(int index, String answer);
}
