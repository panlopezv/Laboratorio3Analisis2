/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import invocador.Boton;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EST1522712
 */
public class Control {
    private ArrayList<Boton> botones;

    public Control() {
        botones = new ArrayList<>();
    }

    public ArrayList<Boton> getBotones() {
        return botones;
    }

    public void setBotones(ArrayList<Boton> botones) {
        this.botones = botones;
    }
    
    
    public void agregarBoton(Boton boton){
        botones.add(boton);
    }
    
}
