/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import invocador.Boton;
import java.util.List;

/**
 *
 * @author EST1522712
 */
public class Control {
    private List<Boton> botones;

    public Control() {
    }

    public List<Boton> getBotones() {
        return botones;
    }

    public void setBotones(List<Boton> botones) {
        this.botones = botones;
    }
    
    
    public void agregarBoton(Boton boton){
        botones.add(boton);
    }
    
}
