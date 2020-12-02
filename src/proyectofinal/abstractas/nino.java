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
public class nino extends personaGeneral{
    
    public nino(String n, int e, String m,String s){
        this.nombre = n;
        this.edad = e;
        this.email = m;
        this.sexo  = s;
    }
    
    public String eLetras(){
        String r = "Inicial";
        return r;
    }
    
    public String sLetras(String a){
        String g = "";
        if(a.equals("F")|| a.equals("f"))
            g = "Femenina: niña";
        else if(a.equals("M")|| a.equals("m"))
            g = "Masculino: niño";
        else
            g = "Indefinido";

        return g;
    }
}
