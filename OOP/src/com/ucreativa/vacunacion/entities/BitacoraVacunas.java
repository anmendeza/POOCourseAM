package com.ucreativa.vacunacion.entities;

import java.util.Date;

public class BitacoraVacunas {       //Aqui el extends hace que la clase "Amigo" herede de la clase "Persona"

    private Persona persona;
    private String marca;
    private Date fecha;
    private String lugarDeVacunacion;           //Estos son atributos unicos de la clase "Vacunacion"

    public BitacoraVacunas(Persona persona, String marca, Date fecha, String lugarDeVacunacion) {
        this.persona = persona;
        this.marca = marca;                                     //Estos son los constructores
        this.fecha = fecha;
        this.lugarDeVacunacion = lugarDeVacunacion;
    }
    public Persona getPersona() {return persona; }
    public String getMarca() {                      //Estos son los gets
        return marca;
    }
    public Date getFecha() {
        return fecha;
    }
    public String getLugarDeVacunacion() {
        return lugarDeVacunacion;
    }
}
