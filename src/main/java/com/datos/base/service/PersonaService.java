
package com.datos.base.service;

import com.datos.base.Interface.IPersonaService;
import com.datos.base.entity.Persona;
import com.datos.base.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persoRepository;
    

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso); 
    }


    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id); 
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
    
    
}
