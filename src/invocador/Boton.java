/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invocador;

import comando.Comando;

/**
 *
 * @author EST1522712
 */
public class Boton {
    private Comando co;
    private int numero;
    
    public Boton() {
    }

    public Boton(Comando co, int numero) {
        this.co=co;
        this.numero=numero;
    }
    
        public Comando getCo() {
        return co;
    }

    public void setCo(Comando co) {
        this.co = co;
    }
    
    
    public void presionado(){
        co.ejecutar();
    }
    
}
