package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchestoCentimeters(6, 13);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchestoCentimeters(157);
    }

        public static double calcFeetAndInchestoCentimeters(double feet, double inches){
        if((feet < 0) ||  ((inches <0) || (inches > 12))){
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
       public static double calcFeetAndInchestoCentimeters(double inches){
        if(inches <0){
            return -1;
        }
           double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
           System.out.println(inches + " inches is equal to " + feet + " Feet and " + remainingInches);
           return calcFeetAndInchestoCentimeters(feet, remainingInches);
       }












    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("UnnamedPlayer scored " + score + " Points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


}
