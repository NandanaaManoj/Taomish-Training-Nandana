package org.example;

import java.util.*;

class QuizGame implements QuizInterface {
    ArrayList<String> questions = new ArrayList<>();
    ArrayList<String[]> options = new ArrayList<>();
    HashMap<Integer, String> answers = new HashMap<>();
    private int score = 0;

    public QuizGame() {
        questions.add("What is 5+4?");
        questions.add("Who is the king of jungle?");
        questions.add("Which number comes after 100?");
        //options
        options.add(new String[]{"A. 8", "B. 10", "C. 9", "D. 7"});
        options.add(new String[]{"A. TIGER", "B. LION", "C. PEACOCK", "D. LEOPARD"});
        options.add(new String[]{"A. 101", "B. 105", "C. 103", "D. 107"});
        //answers
        answers.put(0, "C");
        answers.put(1, "B");
        answers.put(2, "A");
    }

    public void showQuestion(int index) {
        System.out.println(questions.get(index));
    }

    public void showOptions(int index) {
        for (String option : options.get(index)) {
            System.out.println(option);
        }
    }

    public int fetchScore() {
        return score;
    }

    public boolean checkAnswer(int index, String answer) {
        if (answers.get(index).equalsIgnoreCase(answer)) {
            score++;
            return true;
        }
        return false;
    }

    public void startQuiz() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("HELLO " + name + ", let's begin.\n");
        for (int i = 0; i < questions.size(); i++) {
            showQuestion(i);
            showOptions(i);

            System.out.print("Enter your answer (A/B/C/D): ");
            String userAnswer = s.nextLine();

            if (checkAnswer(i, userAnswer)) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("End of quiz! Your final score is: " + fetchScore());
        s.close();
    }
}

