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
public class adulto extends personaGeneral{
    
    public adulto(String n, int e, String m,String s){
        this.nombre = n;
        this.edad = e;
        this.email = m;
        this.sexo  = s;
    }
    
    public String eLetras(){
        String r = "Medio";
        return r;
    }
    
    public String sLetras(String a){
        String g = "";
        if(a.equals("F")|| a.equals("f"))
            g = "Femenina: Adulta";
        else if(a.equals("M")|| a.equals("m"))
            g = "Masculino: Adulto";
        else
            g = "Indefinido";

        return g;
    }
}
