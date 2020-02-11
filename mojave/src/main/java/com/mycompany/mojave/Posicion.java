/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mojave;

/**
 *
 * @author redes
 */
public class Posicion {
    private double teta1;
    private double teta2;
    private double teta3;

    public Posicion(double teta1, double teta2, double teta3) {
        this.teta1 = teta1;
        this.teta2 = teta2;
        this.teta3 = teta3;
    }

    public double getTeta1() {
        return teta1;
    }

    public double getTeta2() {
        return teta2;
    }

    public double getTeta3() {
        return teta3;
    }

    public void setTeta1(double teta1) {
        this.teta1 = teta1;
    }

    public void setTeta2(double teta2) {
        this.teta2 = teta2;
    }

    public void setTeta3(double teta3) {
        this.teta3 = teta3;
    }    
}
