
package com.portfolio.yv.Servicio;


import com.portfolio.yv.Interface.IPersonaServicio;
import org.springframework.stereotype.Service;

import com.portfolio.yv.Entidad.Persona;
import com.portfolio.yv.Repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
@Service 
public class ImplementacionPersonaServicio implements IPersonaServicio{
   @Autowired IPersonaRepositorio ipersonaRepositorio;
   
 @Override
    public List<Persona> getPersona(){
        List<Persona> persona = ipersonaRepositorio.findAll();
        return persona;
    }
 @Override
    //Guarda un objeto de tipo persona
    public void savePersona(Persona persona){
        ipersonaRepositorio.save(persona);
    }
 @Override
    //eliminar por id
    public void deletePersona(Long id){
        ipersonaRepositorio.deleteById(id);
    }
 @Override
    //buscar persona
    public Persona findPersona(Long id){
        Persona persona = ipersonaRepositorio.findById(id).orElse(null);
        return persona;
    }
}
