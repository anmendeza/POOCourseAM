package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
    }
    public void save(String nombre, String cedula, String txtedad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca, String lugar){

        int edad = Integer.parseInt(txtedad);

        Persona persona;
        if(isAmigo){
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        }else{
            persona = new Familiar(nombre,cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date(), lugar);
    }

    public List<String> get(){
        return this.repository.get();
    }
}
