package com.ucreativa;

import com.ucreativa.familia.Andrea;
import com.ucreativa.familia.Yoryi;


public class Main {

    public static void main(String[] args) {

        Andrea yo = new Andrea( "Hola! Soy Andrea, tengo ", 23, "Peliculas");    //estos es un objeto con attributos reasignados

        Yoryi mama = new Yoryi("Hola! Yo soy Georgina", 59, "Macrame");

        mama.setCumple();       // esto es un metodo set

        int edad = mama.getEdad();        //esto es un metodo get

        System.out.println("Tengo " + mama.getEdad() + " años cumplidos");
    }
}