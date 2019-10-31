package es.javier.models;

public class Animal {

    private String tipo;
    private String nombre;
    private int numero_patas;
    private int esperanza_vida;

    public Animal(String tipo, String nombre, int numero_patas, int esperanza_vida){
        setTipo(tipo);
        setNombre(nombre);
        setNumero_patas(numero_patas);
        setEsperanza_vida(esperanza_vida);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_patas() {
        return numero_patas;
    }

    public void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }

    public int getEsperanza_vida() {
        return esperanza_vida;
    }

    public void setEsperanza_vida(int esperanza_vida) {
        this.esperanza_vida = esperanza_vida;
    }
}
