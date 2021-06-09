package com.ucreativa;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Familiar mama = new Familiar("Yoryi", "203750552", 59,
                true, "mama");
                                                                                                //estos son objetos

        Familiar esposo = new Familiar("Oscar", "207160430", 27,
                false, "hermano");


        Amigo amigoTrabajo = new Amigo("Badir", "0001000010001", 23,
                false, "trabajo", "bvillarroel");

        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(esposo, "AstraZenca", new Date(), "Quesada"));
        bitacora.add(new BitacoraVacunas(mama, "AstraZenca", new Date(), "Quesada"));
        bitacora.add(new BitacoraVacunas(amigoTrabajo, "AstraZenca", new Date(), "Cochabamba"));



    }
}