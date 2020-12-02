/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.sobrecarga;

/**
 *
 * @author kesec
 */
public class volumen {
    public double calculoVol(double a, double b, double c){
        return a*b*c;
    }
    public double calculoVol(double a){
        return (1.333333333)*(Math.PI)*(Math.pow(a, 3));
    }
    public double calculoVol(double a, double b){
        return ((Math.PI)*(Math.pow(a, 2))*b)/3;
    }
}
