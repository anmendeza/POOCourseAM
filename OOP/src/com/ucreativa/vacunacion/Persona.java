package com.ucreativa.vacunacion;

public class Persona {
    private String nombre;          //aqui se agregan los atributos de la clase
    private String cedula;          //Agregar constructores: click derecho sobre el atributo > show content actions > add constructor parameter
    private int edad;               //Agregar gets: Click derecho sobre el atributo > Generate > Getter
    private boolean riesgo;         //Agregar sets: Click derecho sobre el atributo > Generate > Setter



    public Persona(String nombre, String cedula, int edad, boolean riesgo, boolean riesgo1) {
        this.nombre = nombre;
        this.cedula = cedula;               //Estos son los constructores para los atributos
        this.edad = edad;
        this.riesgo = riesgo;
    }


    public String getNombre() {
        return nombre;
    }
    public String getCedula() {             //Estos son metodos de get
        return cedula;
    }
    public int getEdad() {
        return edad;
    }
    public boolean isRiesgo() {
        return riesgo;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }                                          //Estos son metodos de set
    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }
}
