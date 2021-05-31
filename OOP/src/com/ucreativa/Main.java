package com.ucreativa;

import com.ucreativa.familia.Andrea;
import com.ucreativa.familia.Yoryi;


public class Main {

    public static void main(String[] args) {

        Andrea yo = new Andrea( "Hola", 23);    //estos es un objeto con attributos reasignados

        Yoryi mama = new Yoryi("Hola! Yo soy Georgina");

        mama.setCumple();       // esto es un metodo set

        int edad = mama.getEdad();        //esto es un metodo get

        System.out.println("Tengo " + mama.getEdad() + " años cumplidos");
    }
}