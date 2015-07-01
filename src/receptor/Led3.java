/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receptor;

import laboratorio3.Principal;

/**
 *
 * @author EST1522712
 */
public class Led3 implements Led{

    @Override
    public void encender() {
        Principal.led3=Boolean.TRUE;
    }

    @Override
    public void apagar() {
        Principal.led3=Boolean.FALSE;
    }
    
}
