package com.ucreativa.vacunacion;

public class Familiar extends Persona {          //Aqui el extends hace que la clase "Familiar" herede de la clase "Persona"

    private String parentesco;       //Esto es un atributo unico de la clase "Familiar"

    public Familiar(String nombre, String cedula, int edad, boolean riesgo, boolean riesgo1, String parentesco) {
        super(nombre, cedula, edad, riesgo, riesgo1); //Aqui, esta instanciando los atributos de la clase "Persona" de manera que "Familiar" los hereda
        this.parentesco = parentesco;
    }

    public String getParentesco() {         //Aqui se esta generando un metodo get para el atributo "Parentezco"
        return parentesco;
    }
}

//get retorna algo > le saca campos al objeto
//set recive algo  > le mete campos a la clase



//Pregunta: por qué razón me esta generando "riesgo1" ? Al eliminarlo genera un error :(