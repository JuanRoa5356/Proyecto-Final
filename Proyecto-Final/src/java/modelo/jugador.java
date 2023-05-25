package modelo;

public class jugador {

    private String nombre;
    private int peso;
    private int estatura;
    private String cedula;
    private String puntos;

    public jugador(String nombre,int peso, int estatura, String cedula, String puntos) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.cedula = cedula;
        this.puntos = puntos;
    }
    
    public jugador(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getpeso() {
        return peso;
    }

    public void setpeso(int peso) {
        this.peso = peso;
    }
    
    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }
    
    
    
    
}
