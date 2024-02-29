package co.edu.escuelaing.hangman.model;

public class PowerScore implements GameScore{
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
        return 0;
    }
}