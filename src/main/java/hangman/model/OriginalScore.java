package hangman.model;
import com.google.inject.Inject;
public class OriginalScore implements GameScore{
	private int score;
	@Inject
	public OriginalScore(){
		score = 100;	
	}

	/**
	*@param Entran dos enteros para comparar correctCount  , incorrectCount  
	*@pre Recibe dos enteros para hacer verificacion correctCount  , incorrectCount 
	*@pos Devuelve el resultado después de hacerlo
	*@return score  	
	*@throws valorNegativoException
	*/
	public int calculateScore(int correctCount, int  incorrectCount) throws GameScoreException{
		if( correctCount < 0 || incorrectCount <0 ){
            throw new GameScoreException( GameScoreException.NEGATIVE_NUMBERS);
        }
		score -= incorrectCount*10;
        if(score < 0) score = 0;
			return score;
	}
}