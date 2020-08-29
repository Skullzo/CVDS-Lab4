/*
 * To change this license header, choose License Headers in Project Properties.
 */
package hangman.model;

import com.google.inject.Inject;

/**
 *
 * @author 2106913
 */
public class French implements Language{
    @Inject
    public French(){    
    }
    
    @Override
    public String[] getFunctionControllerNames() {
        return new String[]{"Jouer","Score Èlevé","Crédits"};
    }

    @Override
    public String getPointsNameLabel() {
        return "Points: ";
    }

    @Override
    public String getHangmanLabel() {
        return "Bourreau";
    }

    @Override
    public String[] getBackSkypeButtonLabel() {
        return new String[]{"Arrière","Sauter"};
    }

    @Override
    public String[] getAccesButton() {
        return new String[]{"Jeu terminé!","Nouveau Jeu","Menu principal"};
    }

    @Override
    public String getFinalScorelabel() {
        return "Score Final: ";
    }
    
}