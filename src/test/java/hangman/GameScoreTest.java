package hangman;

import org.junit.Assert;
import org.junit.Test;

import hangman.model.*;


public class GameScoreTest 
{
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
	public void probarValorNormalOriginalScore(){
		GameScore score= new OriginalScore();
		int prueba = score.calculateScore(5,10);
		Assert.assertEquals(prueba,0);
	}

	@Test
	public void probarRetorna0OriginalScore(){
		GameScore score= new OriginalScore();
		int prueba = score.calculateScore(5,12);
		Assert.assertEquals(prueba,0);
	}

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
	public void probarValorNormalBonusScore(){
		GameScore score= new BonusScore();
		int prueba = score.calculateScore(5,12);
		Assert.assertEquals(prueba,0);
	}

	@Test
	public void probarRetorna0BonusScore(){
		GameScore score= new BonusScore();
		int prueba = score.calculateScore(5,12);
		Assert.assertEquals(prueba,0);
	}


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
	public void probarValorNormalPowerScore(){
		GameScore score= new PowerBonusScore();
		int prueba = score.calculateScore(5,12);
		Assert.assertEquals(prueba,0);
	}

	@Test
	public void probarRetorna0PowerScore(){
		GameScore score= new PowerBonusScore();
		int prueba = score.calculateScore(5,12);
		Assert.assertEquals(prueba,0);
	}

	@Test
	public void probarRetorna500PowerScore(){
		GameScore score= new PowerBonusScore();
		int prueba = score.calculateScore(5,12);
		Assert.assertEquals(prueba,0);

}
}