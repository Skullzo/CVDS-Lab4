/*
 * To change this license header, choose License Headers in Project Properties.
 */
package hangman.model;

import com.google.inject.Inject;

/**
 *
 * @author 2106913
 */
public class Spanish implements Language{
    @Inject
    public Spanish(){    
    }
    @Override
    public String[] getFunctionControllerNames() {
        return new String[]{"Jugar","Altos Puntajes","Creditos"};
    }

    @Override
    public String getPointsNameLabel() {
        return "Puntaje: ";
    }

    @Override
    public String getHangmanLabel() {
        return "Ahorcado";
    }

    @Override
    public String[] getBackSkypeButtonLabel() {
        return new String[]{"Atras","Omitir"};
    }

    @Override
    public String[] getAccesButton() {
        return new String[]{"¡Juego terminado!","Nuevo Juego","Menú Principal"};
    }

    @Override
    public String getFinalScorelabel() {
        return "Puntuación Final: ";
    }
    
}