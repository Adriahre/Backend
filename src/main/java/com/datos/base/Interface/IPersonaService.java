
package com.datos.base.Interface;

import com.datos.base.entity.Persona;
import java.util.List;



public interface IPersonaService {
    public List<Persona> getPersona();
    public void savePersona (Persona perso);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);
}
