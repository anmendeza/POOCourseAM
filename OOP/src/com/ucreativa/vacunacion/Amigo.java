package com.ucreativa.vacunacion;

public class Amigo extends Persona{           //Aqui el extends hace que la clase "Amigo" herede de la clase "Persona"


    private String relacion;
    private String facebook;                  //Estos son atributos unicos de la clase "Amigo"



    public Amigo(String nombre, String cedula, int edad, boolean riesgo, boolean riesgo1, String relacion, String facebook) {
        super(nombre, cedula, edad, riesgo, riesgo1);       //Aqui, esta instanciando los atributos de la clase "Persona" de manera que "Amigo" los hereda


        this.relacion = relacion;              //Estos son los constructores para los dos atributos unicos de esta clase "Amigo"
        this.facebook = facebook;
    }


    public String getFacebook() {
        return facebook;
    }                                          //Estos son metodos de Get
    public String getRelacion() {
        return relacion;
    }
}


//Pregunta: Aqui también me esta generando "riesgo1", por qué pasa esto?