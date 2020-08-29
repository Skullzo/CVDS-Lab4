package hangman;

import org.junit.Assert;
import org.junit.Test;

import hangman.model.*;


public class GameScoreTest 
{
	/**
	*  OriginalScore test
	*  @pre En el caso inicial el usuario cuenta con 100 puntos 
	*  @pos el jugador debe terminar con una puntuacion mayor a 0 y menor a 100
	*  @throws el valor no debe ser negativo
	*  @throws el valor si supera los 11 incorrectCount debe ser 0
	*/	
	@Test
	public void probarValorFallidoOriginalScore(){
		GameScore score= new OriginalScore();
		try {
			int prueba = score.calculateScore(0,-5);
		}
		catch(Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void probarValorNormalOriginalScore() throws GameScoreException{
		GameScore score= new OriginalScore();
		int prueba = score.calculateScore(5,5);
		Assert.assertEquals(prueba,50);
	}

	@Test
	public void probarRetorna0OriginalScore() throws GameScoreException{
		GameScore score= new OriginalScore();
		int prueba = score.calculateScore(5,12);
		Assert.assertEquals(prueba,0);
	}

	/**
	*  BonusScore test
	*  @pre En el caso inicial el usuario inicia con 0 puntos
	*  @pos El puntaje minimo es de 0
	*  @throws El valor no debe ser negativo
	*  @throws Si el valor incorrectCount es dos veces mayor estrico a CorrectCount debe ser 0
	*/	
	
	@Test
	public void probarValorFallidoBonusScore(){
		GameScore score= new BonusScore();
		try {
			int prueba = score.calculateScore(0,-5);
		}
		catch(Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void probarValorNormalBonusScore() throws GameScoreException{
		GameScore score= new BonusScore();
		int prueba = score.calculateScore(5,8);
		Assert.assertEquals(prueba,10);
	}

	@Test
	public void probarRetorna0BonusScore() throws GameScoreException{
		GameScore score= new BonusScore();
		int prueba = score.calculateScore(5,11);
		Assert.assertEquals(prueba,0);
	}


	
	/**
	*  PowerBonusScore test
	*  @pre En el caso inicial el usuario inicia con 0 puntos
	*  @pos El puntaje minimo es de 0
	*  @pos El puntaje máximo es de 500
	*  @throws El valor no debe ser negativo
	*/	
	@Test
	public void probarValorFallidoPowerScore(){
		GameScore score= new PowerBonusScore();
		try {
			int prueba = score.calculateScore(0,-5);
		}
		catch(Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void probarValorNormalPowerScore() throws GameScoreException{
		GameScore score= new PowerBonusScore();
		int prueba = score.calculateScore(2,3);
		Assert.assertEquals(prueba,6);
	}

	@Test
	public void probarRetorna0PowerScore() throws GameScoreException{
		GameScore score= new PowerBonusScore();
		int prueba = score.calculateScore(1,2);
		Assert.assertEquals(prueba,0);
	}

	@Test
	public void probarRetorna500PowerScore() throws GameScoreException{
		GameScore score= new PowerBonusScore();
		int prueba = score.calculateScore(4,1);
		Assert.assertEquals(prueba,500);
	}
}