package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerrie
 */
public class CollegeQuiz {

    // create the variables
    private String questionText;
    private String correctAnswer;
    private int mark = 100;
    private String answer;
    private String guess;



    private String student;
    private String teacher;

    //create default constructo//
    public CollegeQuiz() {
        questionText = "";
        correctAnswer = "";
        answer = "";
        guess = "";

        //intilaise the strings
        this.student = student;
        this.guess = guess;
        this.answer = answer;
        this.mark = mark;

    }
    //compute method

    public compute() {

        System.out.println("Your Question is: " + questionText);
        String Msg = null;
        if (answer == correctAnswer) {
            Msg = "Your answer is correct you get full marks" + mark;
        } else {
            Msg = "Your answer is incorrect";
        }

    }

    //getter and setters for student
    public String getMark() {
        return mark;
    }

    public compute(){
        return compute;
    }

    public void setMark(mark) {
        this.mark = mark;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

}
