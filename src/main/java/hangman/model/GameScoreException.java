package hangman.model;

public class GameScoreException extends Exception {
    public static final String NEGATIVE_NUMBERS = "Some of the count numbers are negative.";
    public GameScoreException(String message ){
        super( message);
    }
}