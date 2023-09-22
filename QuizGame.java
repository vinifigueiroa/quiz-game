/** This program prompts the user with a series of questions and
 * allows them to enter their answers. After the user has answered
 * all the questions, the program displays the final score
 * based on the number of correct answers.
*/

import java.util.Scanner;

public class QuizGame {

    static int AnswerChecker(String Question, String CorrectAnswer, Scanner scanner) {

        // Displays Question
        System.out.println(Question);

        // Asks the user for the answer
        System.out.println("Type the letter corresponding to your correct answer and press ENTER: \n");
        String UserAnswer = scanner.nextLine().toLowerCase();
        int score = 0;

        // Check Answer and Update Score
        if (UserAnswer.equals(CorrectAnswer.toLowerCase())) {

            System.out.println("\n----Correct! :)\n");
            score++;

        }   else {

            System.out.println("\n---- Incorrect :(\n");
        }

        System.out.println("PRESS ENTER TO CONTINUE \n");
        scanner.nextLine();

        return score;
    }

    public static void main (String[] args) {


        // Initializing Score Counter
        int counter = 0;
        int TotalQuestions = 5;

        // Introduction
        System.out.println("\nWelcome to the BeyQuiz!");
        System.out.println("\nTry to answer the next 05 questions correctly!");
        System.out.println("Ready? Here we go! \n\nPRESS ENTER TO START\n");


        // Press ENTER to Start
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();


        // Question 01
        String Q1 = """
            01 - What is Beyoncé's full name?\n
            A) Beyoncé Giselle Carter\n
            B) Beyoncé Giselle Johnson\n
            C) Beyoncé Giselle Smith\n
            D) Beyoncé Giselle Knowles-Carter\n
        """;

        // Check Answer and Update Score
        counter += QuizGame.AnswerChecker(Q1, "d", scanner);


        // Question 02
        String Q2 = """
            In which girl group did Beyoncé first gain fame?\n
            A) Destiny's Children\n
            B) The Supremes\n
            C) TLC\n
            D) Destiny's Child\n
        """;


        // Check Answer and Update Score
        counter += QuizGame.AnswerChecker(Q2, "d", scanner);


        // Question 03
        String Q3 = """
        Which album featured Beyoncé's hit single "Single Ladies (Put a Ring on It)"?\n
        A) Dangerously in Love\n
        B) I Am... Sasha Fierce\n
        C) Lemonade\n
        D) B'Day\n
        """;


        // Check Answer and Update Score
        counter += QuizGame.AnswerChecker(Q3, "b", scanner);


        // Question 04
        String Q4 = """
        Beyoncé voiced which character in the Disney film "The Lion King" (2019)?\n
        A) Nala\n
        B) Sarabi\n
        C) Shenzi\n
        D) Rafiki\n
        """;


        // Check Answer and Update Score
        counter += QuizGame.AnswerChecker(Q4, "a", scanner);


        // Question 05
        String Q5 = """
        In which year did Beyoncé release her visual album "Lemonade"?\n
        A) 2013\n
        B) 2016\n
        C) 2018\n
        D) 2020\n
        """;



        // Check Answer and Update Score
        counter += QuizGame.AnswerChecker(Q5, "b", scanner);
        int percentage = counter * (100/TotalQuestions);


        // Display Score

        String FinalMessage = switch (percentage) {
            case 0 -> "Try Again!";
            case 20, 40, 60 -> "You could do better!";
            case 70, 80 -> "Almost Perfect!";
            default -> "Are you my cousin?";

        };

        System.out.println("YOUR SCORE: " + counter + "\n\n" + FinalMessage + "\n\nYou Got " + percentage + "% of questions correct.\n\n");


        // Close Scanner
        scanner.close();

    }
} // end of class QuizGame
