/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.abstractas;

/**
 *
 * @author kesec
 */
public abstract class personaGeneral {
    public String nombre = "";
    public int edad = 0;
    public String email = "";
    public String sexo = "";
    
    public abstract String eLetras();
    public abstract String sLetras(String a);
   
}
