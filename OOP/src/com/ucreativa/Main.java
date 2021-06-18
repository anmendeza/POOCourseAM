package com.ucreativa;

import com.ucreativa.vacunacion.repositories.InMemoryRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        //asi se escanea
        BitacoraService service = new BitacoraService(new InMemoryRepository());
        String nombre, cedula, edad, riesgo, isAmigo, relacion ="", facebook = "", parentesco = "", marca, lugar;
        boolean seguir = true;
        while(seguir) {
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

            } else {
                    System.out.println("Parentesco:");
                    parentesco = in.nextLine();
            }
            System.out.println("Marca de vacuna");
            marca = in.nextLine();

            System.out.println("Lugar de vacunacion");
            lugar = in.nextLine();

            service.save(nombre, cedula, edad, riesgo.equals("S"),isAmigo.equals("A"), relacion, facebook, parentesco, marca, lugar);

            System.out.println("Quiere imprimir lista? (S)");
            String print = in.nextLine();
            if (print.equals("S")){
                for (String item: service.get()) {
                    System.out.println(item);
                }
            }
            System.out.println("Continuar? (S)");
            seguir = !in.nextLine().equals("N");
        }
    }
}