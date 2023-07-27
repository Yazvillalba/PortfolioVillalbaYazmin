
package com.portfolio.yv.Repositorio;

import com.portfolio.yv.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona, Long> {
    
}