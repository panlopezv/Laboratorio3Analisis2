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
public class Comando_ON_L1  implements Comando {
    private Led led;    

    public Comando_ON_L1(Led led) {
        this.led = led;
    }

    public Led getLed() {
        return led;
    }

    public void setLed(Led led) {
        this.led = led;
    }
    

    @Override
    public void ejecutar() {
        led.encender();
    }
    
}
