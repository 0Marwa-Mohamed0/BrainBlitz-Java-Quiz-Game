package com.quiz.project.quizapp;

import static com.quiz.project.quizapp.DBConnection.connect;

public class QuizApp {
    static int score = 0;
    public static void main(String[] args) {
        connect();  
        Login L = new Login ();

    }
}