package com.ucreativa.familia;

public class Andrea extends Yoryi {         //extends hace que la primera clase Andrea herede la segunda clase Yoryi


    public Andrea(String saludo, int edad, String hobby) {
        super(saludo, edad, hobby);         //super hace que los atributos de la clase Yoryi se instancien en la clase Andrea
    }
}
