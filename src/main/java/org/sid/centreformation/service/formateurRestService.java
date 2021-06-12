package org.sid.centreformation.service;

import org.sid.centreformation.entities.formateur;
import org.sid.centreformation.metier.formateurmetierImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class formateurRestService {
    @Autowired
    private formateurmetierImp formateurmetierImp;

    @RequestMapping(value = "/formateurs" , method= RequestMethod.POST)
    public formateur saveFormateur(@RequestBody formateur f) {
        return formateurmetierImp.saveFormateur(f);
    }

    @RequestMapping(value = "/formateurs" , method= RequestMethod.GET)
    public List<formateur> listFormateur() {
        return formateurmetierImp.listFormateur();
    }

    @RequestMapping(value = "/formateurs/{id}" , method= RequestMethod.GET)
    public Optional<formateur> getFormateur(@PathVariable Long id ){
        return formateurmetierImp.getFormateur(id);
    }

    @RequestMapping(value = "/formateurs/{id}" , method= RequestMethod.DELETE)
    public boolean deleteFormateur (@PathVariable  Long id){
        formateurmetierImp.supprimerformateur(id);
        return true;
    }
    @RequestMapping(value = "/formateurs/{id}" , method= RequestMethod.PUT)
    public boolean modifierFormateur (@PathVariable  Long id,@RequestBody formateur f){

        formateurmetierImp.modifierformateur(id, f);
        return true;
    }

    @RequestMapping(value = "/countformateurs" , method= RequestMethod.GET)
    public long countFormateur(){
        return formateurmetierImp.countformateur();
    }

}
