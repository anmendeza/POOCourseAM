package com.ucreativa;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.InMemoryRepository;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;               //esto es la libreria de escaner

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        //asi se escanea
        Repository repo = new InMemoryRepository();
        while(true) {
            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, lugar;
            Persona persona;
            System.out.println("Nombre:");
            nombre = in.nextLine();

            System.out.println("Cedula:");
            cedula = in.nextLine();

            System.out.println("Edad:");
            edad = in.nextLine();

            System.out.println("Riesgo(S/N):");
            riesgo = in.nextLine();

            System.out.println("Amigo(A)/Familiar(F):");
            isAmigo = in.nextLine();                //Aqui esta usando equals por que necesita comparar
            if (isAmigo.equals("A")) {                //la A como objeto y no como String en memoria
                System.out.println("Relacion:");
                relacion = in.nextLine();
                System.out.println("Facebook:");
                facebook = in.nextLine();

                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);
                //aca se utiliza Interger.parseInt por que edad no es una variable de tipo string
                //es una variable de tipo int, y al estar con strings da error

                //Tambien, se utiliza riesgo.equals por que riesgo es de tipo boolean
            } else {
                    System.out.println("Parentesco:");
                    parentesco = in.nextLine();
                    persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentesco);
            }
            System.out.println("Marca de vacuna");
            marca = in.nextLine();

            System.out.println("Lugar de vacunacion");
            lugar = in.nextLine();

            repo.save(persona, marca, new Date(), lugar);

            System.out.println("Quiere imprimir lista? (S)");
            String print = in.nextLine();
            if (print.equals("S")){
                for (String item: repo.get()){
                    System.out.println(item);
                }
            }
        }
    }
}