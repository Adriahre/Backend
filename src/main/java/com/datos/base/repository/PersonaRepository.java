
package com.datos.base.repository;

import com.datos.base.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
