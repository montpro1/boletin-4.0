/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg4;

/**
 *
 * @author vmontestovar
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coche obxCoche1=new coche();
        obxCoche1.getVelocidad();
        obxCoche1.acelerar(10);
        System.out.println(obxCoche1.getVelocidad());
        obxCoche1.frenar(18);
     
       System.out.println(obxCoche1.getVelocidad());
    }
        
        
        // TODO code application logic here
    }
    

