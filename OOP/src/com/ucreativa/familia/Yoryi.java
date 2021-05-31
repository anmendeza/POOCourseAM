package com.ucreativa.familia;

public class Yoryi {                    // esto es una clase

    private int edad;                    // estos tres son atributos de clase
    private String hobby;

    public Yoryi(String saludo,
                 int edad,
                 String hobby) {// esto es un constructor con el parametro "saludo"
        this.edad = edad;
        this.hobby = hobby;
        System.out.println(saludo);
    }

    public int getEdad(){               //esto es un metodo get
        return this.edad;
    }

    public void setCumple(){            // esto es un metodo set || void es un metodo que no retorna nada
        this.edad = this.edad + 1;      // esto esta reasignando el valor de edad
    }

}
