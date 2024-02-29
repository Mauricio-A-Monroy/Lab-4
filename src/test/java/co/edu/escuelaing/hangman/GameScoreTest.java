package co.edu.escuelaing.hangman;

import co.edu.escuelaing.hangman.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameScoreTest {
    /**
     * Equivalence Class 1: Initial Score (100 points).
     * Equivalence Class 2: Penalty for incorrect letter (-10 points per letter).
     * Equivalence Class 3: Minimum Score (0 points).
     */
    private GameScore originalScore = new OriginalScore();

    /**
     * Equivalence Class 1: Initial Score (0 points).
     * Equivalence Class 2: Bonus for correct letter (10 points per letter).
     * Equivalence Class 3: Penalty for incorrect letter (-5 points per letter).
     * Equivalence Class 4: Minimum Score (0 points).
     */
    private GameScore bonusScore = new BonusScore();

    /**
     * Equivalence Class 1: Initial Score (0 points).
     * Equivalence Class 2: Bonus for correct letter (15 points per letter).
     * Equivalence Class 3: Penalty for incorrect letter (-8 points per letter).
     * Equivalence Class 4: Minimum Score (0 points).
     * Equivalence Class 5: Maximum Score (500 points).
     */
    private GameScore powerScore = new PowerScore();


    /*OriginalScore*/
    @Test
    public void shouldReturnOneHundredForTheInitialScore() throws GameScoreExceptions{
        int ans = originalScore.calculateScore(0,0);
        assertEquals(100, ans);
    }

    @Test
    public void shouldReturnEightyForTwoIncorrectLetters() throws GameScoreExceptions{
        int ans = originalScore.calculateScore(0,2);
        assertEquals(80, ans);
    }

    @Test
    public void shouldReturnZeroForTenIncorrectLetters() throws GameScoreExceptions{
        int ans = originalScore.calculateScore(0,10);
        assertEquals(0, ans);
    }

    @Test
    public void shouldThrowExceptionForNegativeScoreInOrigalScore() throws GameScoreExceptions{
        try{
            int ans = originalScore.calculateScore(0,11);
        } catch (GameScoreExceptions e){
            assertEquals(GameScoreExceptions.NEGATIVE_SCORE, e.getMessage());
        };
    }

    /*BonusScore*/
    @Test
    public void shouldReturnZeroForTheInitialScoreInBonusScore() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(0,0);
        assertEquals(0, ans);
    }

    @Test
    public void shouldReturnThirtyForThreeCorrectLetters() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(3,0);
        assertEquals(30, ans);
    }

    @Test
    public void shouldReturnFiveteenForTwoCorrectLettersAndOneIncorrectLatter() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(2,1);
        assertEquals(15, ans);
    }

    @Test
    public void shouldReturnZeroForOneCorrectLettersAndTwoIncorrectLatter() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(1,2);
        assertEquals(15, ans);
    }

    @Test
    public void shouldThrowExceptionForNegativeScoreInBonusScore() throws GameScoreExceptions{
        try{
            int ans = bonusScore.calculateScore(0,1);
        } catch (GameScoreExceptions e){
            assertEquals(GameScoreExceptions.NEGATIVE_SCORE, e.getMessage());
        };
    }

    /*PowerScore*/
    @Test
    public void shouldReturnZeroForTheInitialScoreInPowerScore() throws GameScoreExceptions{
        int ans = powerScore.calculateScore(0,0);
        assertEquals(0, ans);
    }

    @Test
    public void shouldReturnThirtyForTwoCorrectLetters() throws GameScoreExceptions{
        int ans = powerScore.calculateScore(2,0);
        assertEquals(30, ans);
    }

    @Test
    public void shouldReturnTwntytwoForTwoCorrectLettersAndOneIncorrectLatter() throws GameScoreExceptions{
        int ans = powerScore.calculateScore(2,1);
        assertEquals(22, ans);
    }
}
