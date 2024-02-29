package co.edu.escuelaing.hangman.model;
import java.lang.*;

public class PowerBonusScore implements GameScore{

    private int puntaje = 0;
    /**
     *
     * @pre correctCount and incorrectCount are not negative
     * @param correctCount the number of correct letters given by the user
     * @param incorrectCount the number of incorrect letters given by the user
     * @throws GameScoreExceptions if correct count or incorrect count is negative or if score is greater than 500
     * @return the user's total score
     * @pos The score returnet between in 0 and 500.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreExceptions {
        int pCorrect = (int)Math.pow(5, correctCount);
        if (pCorrect == 1){
            pCorrect = 0;
        }
        puntaje = puntaje + pCorrect - (incorrectCount*(8));
        if (puntaje > 500) {
            return 500;
        }return puntaje;
    }
}