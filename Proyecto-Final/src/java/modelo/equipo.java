/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class equipo {
    protected String id;
    protected String teamName;
    protected int jugadores;
    protected String categoria;
    protected int aficionados;
    protected String patrociandor;

    public equipo(String id, String teamName,int jugadores, String categoria, int aficionados, String patrociandor) {
        this.id = id;
        this.teamName = teamName;
        this.jugadores = jugadores;
        this.categoria = categoria;
        this.aficionados = aficionados;
        this.patrociandor = patrociandor;
    }
    
     public equipo(){
         
     }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

         public String getteamName() {
        return teamName;
    }

    public void setteamName(String teamName) {
        this.teamName = teamName;
    }
     
    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAficionados() {
        return aficionados;
    }

    public void setAficionados(int aficionados) {
        this.aficionados = aficionados;
    }

    public String getPatrociandor() {
        return patrociandor;
    }

    public void setPatrociandor(String patrociandor) {
        this.patrociandor = patrociandor;
    }
     
    public String datos(){
        
        return "<tr> <td>" + teamName + "</td>" +
               "<td>" + jugadores + "</td>" +
               "<td>" + categoria + "</td>" +
               "<td>" + aficionados + "</td>" +
               "<td>" + patrociandor + "</td></tr>";
    }
    
}

