/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comando;

import receptor.Led;

/**
 *
 * @author EST1629311
 */
public class Comando_OFF_L2  implements Comando {
    private Led led;    

    public Led getLed() {
        return led;
    }

    public void setLed(Led led) {
        this.led = led;
    }
    

    @Override
    public void ejecutar() {
        led.apagar();
    }
    
}
