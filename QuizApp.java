package quizapp;
import java.util.Scanner;

/**
 *
 * @author Sarosh Ahmed
 */
public class QuizApp {

    public static void main(String[] args) {
        int score = 0;
       Scanner kboard = new Scanner (System.in);
       
    System.out.println("Hello!");
    System.out.println("What is the color of sky?");
    String answer1 = kboard.nextLine();
    if (answer1.equals("blue")) {
        //give them a point
        score++;
        System.out.println("Correct!");
    }
    else {
     System.out.println("Incorrect");    
    }
    System.out.println("what is the name of the galaxy you are living in?");
    String answer2 = kboard.nextLine();
    if (answer2.equals("milkyway")) {
        score++;
        System.out.println("Correct!");
    }
     else {
     System.out.println("Incorrect");
    }
     System.out.println("what is the name of the planet you are living in?");
    String answer3 = kboard.nextLine();
    if (answer3.equals("earth")) {
        score++;
        System.out.println("Correct!");
    }
     else {
     System.out.println("Incorrect");
    }
     System.out.println("what is the chemical formula of carbondioxide?");
    String answer4 = kboard.nextLine();
    if (answer4.equals("CO2")) {
        score++;
        System.out.println("Correct!");
    }
     else {
     System.out.println("Incorrect");
    }
     System.out.println("what is the chemical formula of water?");
    String answer5 = kboard.nextLine();
    if (answer5.equals("H20")) {
        score++;
        System.out.println("Correct!");
    }
     else {
     System.out.println("Incorrect");
    }
    System.out.println("Your score is "+score);
    
    
    
    }
    
}
