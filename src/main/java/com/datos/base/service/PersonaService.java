
package com.datos.base.service;

import com.datos.base.entity.Persona;
import com.datos.base.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class PersonaService{
    
    @Autowired
    private PersonaRepository persoRepository;
    

    public List<Persona> list(){
         return persoRepository.findAll();
     }
     
     public Optional<Persona> getOne(int id){
         return persoRepository.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre){
         return persoRepository.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         persoRepository.save(persona);
     }
     
     public void delete(int id){
         persoRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return persoRepository.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return persoRepository.existsByNombre(nombre);
     }
    
    
}
