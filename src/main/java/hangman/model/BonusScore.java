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
	*@throws Ninguna excepción
	*/
	public int calculateScore(int correctCount, int  incorrectCount){
		return 0;
	}
}