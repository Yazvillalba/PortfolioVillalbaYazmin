
package com.portfolio.yv.Interface;

import com.portfolio.yv.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    //Traer personas
    public List<Persona> getPersona();

    //Guarda un objeto de tipo persona
    public void savePersona(Persona persona);

    //eliminar por id
    public void deletePersona(Long id);

    //buscar persona
    public Persona findPersona(Long id);
}
