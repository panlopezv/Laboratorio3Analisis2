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
public class Led1 implements Led{

    @Override
    public void encender() {
        Principal.led1=Boolean.TRUE;
    }

    @Override
    public void apagar() {
        Principal.led1=Boolean.FALSE;
    }
    
}
