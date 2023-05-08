
package com.datos.base.controler;

import com.datos.base.Interface.IPersonaService;
import com.datos.base.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return interPersona.getPersona();
    }
    
    
    @PostMapping ("/personas/crear")
    public void save(@RequestBody Persona perso){
        interPersona.savePersona(perso);
    }
    
   
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable long id){
        interPersona.deletePersona(id);
        return "La persona fue borrada exitosamente";
    }
    
    
    @PutMapping("personas/editar/{id}")
    public Persona editPersona (@PathVariable long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("edad") int nuevoEdad){
        Persona perso = interPersona.findPersona(id);
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevoEdad);
        
        interPersona.savePersona(perso);
        return perso;
    }
    
    
    @GetMapping ("personas/traer/perfil")
    public Persona findPersona(){
        return interPersona.findPersona((long)2);
    }
}
