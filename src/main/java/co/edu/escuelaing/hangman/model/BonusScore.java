package co.edu.escuelaing.hangman.model;

public class BonusScore implements GameScore{

    private int puntaje = 0;
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
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreExceptions {
        for (int i = 0; i < correctCount; i++){
            puntaje = puntaje + 10;
        }
        for (int i = 0; i < incorrectCount; i++){
            puntaje = puntaje-5;
        }
        return puntaje;
    }
}


