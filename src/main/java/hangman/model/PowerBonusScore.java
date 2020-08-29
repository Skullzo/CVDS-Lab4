package hangman.model;

public class PowerBonusScore implements GameScore{
	private int score;	

	
	public PowerBonusScore(){
		score = 0;	
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
		for(int i=1 ; i<=correctCount ; i++){
			score +=  Math.pow(5, i);
		}
		score -= incorrectCount*8;
        if(score < 0) score = 0;
        if(score > 500) score = 500;
        return score;

	}
}