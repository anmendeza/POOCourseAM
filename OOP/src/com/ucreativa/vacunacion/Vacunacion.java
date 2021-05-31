package com.ucreativa.vacunacion;

public class Vacunacion extends Persona {       //Aqui el extends hace que la clase "Amigo" herede de la clase "Persona"

    private String marcaVacuna;
    private String primeraDosis;                //Estos son atributos unicos de la clase "Vacunacion"
    private String segundaDosis;
    private String lugarDeVacunacion;


    public Vacunacion(String nombre, String cedula, int edad, boolean riesgo, boolean riesgo1, String marcaVacuna, String primeraDosis, String segundaDosis, String lugarDeVacunacion) {
        super(nombre, cedula, edad, riesgo, riesgo1);       //Aqui, esta instanciando los atributos de la clase "Persona" de manera que "Vacunacion" los hereda

        this.marcaVacuna = marcaVacuna;
        this.primeraDosis = primeraDosis;       //Estos son los constructores para los atributos unicos de esta clase "Vacunacion"
        this.segundaDosis = segundaDosis;
        this.lugarDeVacunacion = lugarDeVacunacion;
    }



    public void setMarcaVacuna(String marcaVacuna) {
        this.marcaVacuna = marcaVacuna;
    }
    public void setPrimeraDosis(String primeraDosis) {
        this.primeraDosis = primeraDosis;
    }                                                               //Estos son metodos de Set y Get
    public void setSegundaDosis(String segundaDosis) {
        this.segundaDosis = segundaDosis;
    }
    public String getLugarDeVacunacion() {
        return lugarDeVacunacion;
    }
}
