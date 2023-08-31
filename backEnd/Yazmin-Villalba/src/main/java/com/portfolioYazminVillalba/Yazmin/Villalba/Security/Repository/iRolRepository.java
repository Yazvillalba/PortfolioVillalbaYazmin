
package com.portfolioYazminVillalba.Yazmin.Villalba.Security.Repository;

import com.portfolioYazminVillalba.Yazmin.Villalba.Security.Entity.Rol;
import com.portfolioYazminVillalba.Yazmin.Villalba.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, String>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
