/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author juanc
 */
public class arrayMet {
 
    ArrayList listaP = new ArrayList();
    
    public void adArray(String id, String teamName,int jugadores, String categoria, String pat, int aficionados) {

            equipo eq = new equipo();
            eq.setteamName(teamName);
            eq.setJugadores(jugadores);
            eq.setAficionados(aficionados);
            eq.setCategoria(categoria);
            eq.setPatrociandor(pat);
      
            listaP.add(eq);
        
    }
            
    //hace la consulta del array para luego imprimir
    public String consultaArray(){
        String data = "";
        Iterator itera = listaP.iterator();
        while (itera.hasNext()) {
            Object obj = itera.next();
            equipo equipo = (equipo) obj;
            data += equipo.datos();
            
        }
   
        return data;
    }
    //elimina la posicion que se le indica en arraylist
    public void delArray(int indice){
        
        listaP.remove(indice);
    }
    
}