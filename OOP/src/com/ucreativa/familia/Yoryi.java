package com.ucreativa.familia;

public class Yoryi {                    // esto es una clase

    public String id;
    private int edad;                    // estos tres son atributos de clase
    private String hobby = "macramé";

    public Yoryi(String saludo) {        // esto es un constructor con el parametro "saludo"
        this.edad = 59;
        System.out.println(saludo);
    }
    public void setCumple(){            // esto es un metodo set
        this.edad = this.edad + 1;      // esto esta reasignando el valor de edad
    }

    public int getEdad(){               //esto es un metodo get
        return this.edad;
    }

}
