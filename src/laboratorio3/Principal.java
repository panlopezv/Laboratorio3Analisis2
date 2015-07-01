/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import comando.Comando_OFF_L1;
import comando.Comando_OFF_L2;
import comando.Comando_OFF_L3;
import comando.Comando_ON_L1;
import comando.Comando_ON_L2;
import comando.Comando_ON_L3;
import invocador.Boton;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import receptor.Led1;
import receptor.Led2;
import receptor.Led3;

/**
 *
 * @author EST1629311
 */
public class Principal {

    public static Boolean led1=Boolean.FALSE;
    public static Boolean led2=Boolean.FALSE;
    public static Boolean led3=Boolean.FALSE;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Control c = new Control();
        Led1 l1 = new Led1();
        Led2 l2=new Led2();
        Led3 l3=new Led3();
        c.agregarBoton(new Boton(new Comando_ON_L1(l1),1));
        c.agregarBoton(new Boton(new Comando_ON_L2(l2),2));
        c.agregarBoton(new Boton(new Comando_ON_L3(l3),3));
        c.agregarBoton(new Boton(new Comando_OFF_L1(l1),4));
        c.agregarBoton(new Boton(new Comando_OFF_L2(l2),5));
        c.agregarBoton(new Boton(new Comando_OFF_L3(l3),6));       
        
        System.out.println("LED1: "+led1+" - LED2: "+led2+" - LED3: "+led3);
        c.getBotones().get(0).presionado();
        c.getBotones().get(1).presionado();
        c.getBotones().get(2).presionado();
        System.out.println("LED1: "+led1+" - LED2: "+led2+" - LED3: "+led3);
        c.getBotones().get(3).presionado();
        c.getBotones().get(4).presionado();
        c.getBotones().get(5).presionado();
        System.out.println("LED1: "+led1+" - LED2: "+led2+" - LED3: "+led3);
    }
    
}
