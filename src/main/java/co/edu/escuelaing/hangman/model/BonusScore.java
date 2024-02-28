package co.edu.escuelaing.hangman.model;

public class BonusScore implements GameScore{
    /**
     *
     * @pre correctCount and incorrectCount are not negative
     * @param correctCount the number of correct letters given by the user
     * @param incorrectCount the number of incorrect letters given by the user
     * @throws GameScoreExceptions if correct count or incorrect count is negative
     * @return the user's total score
     * @pos The minimum score returned is 0.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
