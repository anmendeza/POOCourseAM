package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository  {

    private List<BitacoraVacunas> db;

    public InMemoryRepository(){
    this.db = new ArrayList<>();
    }

    public void save(Persona persona, String marca, Date fecha, String lugar){
        this.db.add(new BitacoraVacunas(persona, marca, fecha, lugar));

    }

    @Override
    public List<String> get() {
        return null;
    }


}

