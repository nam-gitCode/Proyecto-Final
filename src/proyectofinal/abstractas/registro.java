/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.abstractas;
import java.util.ArrayList;
import proyectofinal.abstractas.adulto;
/**
 *
 * @author kesec
 */
public class registro {
    ArrayList<personaGeneral>persona = new ArrayList();
    
    public void ingresar(personaGeneral tmp){
        persona.add(tmp);
    }
    
    
    public String listado(){
        String lista = "";
        int n = persona.size();
        String estado = "";
        String genero = "";
        personaGeneral tmp;
        for(int i=0;i<=(n-1);i++){
            tmp = null;
            tmp = persona.get(i);
            
            nino nn = new nino(tmp.nombre, tmp.edad, tmp.email, tmp.sexo);
            adulto ad = new adulto(tmp.nombre, tmp.edad, tmp.email, tmp.sexo);
            adolecente ac = new adolecente(tmp.nombre, tmp.edad, tmp.email, tmp.sexo);
            anciano an = new anciano(tmp.nombre, tmp.edad, tmp.email, tmp.sexo);
            
            if(tmp.edad >=1 && tmp.edad <=11){
                estado = nn.eLetras();
                genero = nn.sLetras(tmp.sexo);
            }else if(tmp.edad >=12 && tmp.edad <=17){
                estado = ac.eLetras();
                genero = ac.sLetras(tmp.sexo);
            }else if(tmp.edad >=18 && tmp.edad <= 64){
                estado = ad.eLetras();
                genero = ad.sLetras(tmp.sexo);
            }else if(tmp.edad >=65){
                estado = an.eLetras();
                genero = an.sLetras(tmp.sexo);
            }
                
            
            lista+= "nombre:" + tmp.nombre+" edad:"+tmp.edad+" e-mail;"+tmp.email+" estado de vida:"+estado+" genero:"+genero+"\n\r";
        }
        return lista;
    }
}
