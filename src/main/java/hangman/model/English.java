/*
 * To change this license header, choose License Headers in Project Properties.
 */
package hangman.model;

import com.google.inject.Inject;

/**
 *
 * @author 2106913
 */
public class English implements Language{
    @Inject
    public English(){    
    }
    
    @Override
    public String[] getFunctionControllerNames() {
        return new String[]{"Play","HighScores","Crédits"};
    }

    @Override
    public String getPointsNameLabel() {
        return "Points: ";
    }

    @Override
    public String getHangmanLabel() {
        return "Hangman";
    }

    @Override
    public String[] getBackSkypeButtonLabel() {
        return new String[]{"Back","Skip"};
    }

    @Override
    public String[] getAccesButton() {
        return new String[]{"Game Over!","New Game","Main Menu"};
    }

    @Override
    public String getFinalScorelabel() {
        return "Final Score: ";
    }
    
}