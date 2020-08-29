package hangman.model;

public class BonusScore implements GameScore{
	private int score;

	
	public BonusScore(){
            score = 0;	
	}

	/**
	*@param Entran dos enteros para comparar correctCount  , incorrectCount  
	*@pre Recibe dos enteros para hacer verificacion correctCount  , incorrectCount 
	*@pos Devuelve el resultado después de hacerlo
	*@return score  	
	*@throws valorNegativoException
	*/
	public int calculateScore(int correctCount, int  incorrectCount)throws GameScoreException{
		if( correctCount < 0 || incorrectCount <0 ){
            throw new GameScoreException( GameScoreException.NEGATIVE_NUMBERS);
        }	
		score -= incorrectCount*5;
        score += correctCount*10;
        if(score < 0){ score = 0;}
        return score;
	}
}