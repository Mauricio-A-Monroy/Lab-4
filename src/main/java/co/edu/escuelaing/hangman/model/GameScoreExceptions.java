package co.edu.escuelaing.hangman.model;

public class GameScoreExceptions extends Exception{
    public static String NEGATIVE_SCORE = "The score cannot be negative";
    public static String VERY_HIGH_SCORE = "The score is greater than 500";

    public GameScoreExceptions(String message) {
        super(message);
    }

}
