package org.sid.centreformation.service;

import org.sid.centreformation.entities.formation;
import org.sid.centreformation.metier.formationmetierImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class formationRestService {
    @Autowired
    private formationmetierImp formateurmetierImp;

    @RequestMapping(value = "/formations" , method= RequestMethod.POST)
    public formation saveformation(@RequestBody formation f) {
        return formateurmetierImp.saveFormation(f);
    }

    @RequestMapping(value = "/formations" , method= RequestMethod.GET)
    public List<formation> listFormation() {
        return formateurmetierImp.listFormation();
    }

    @RequestMapping(value = "/formations/{id}" , method= RequestMethod.GET)
    public Optional<formation> getFormation(@PathVariable Long id ){
        return formateurmetierImp.getFormation(id);
    }

    @RequestMapping(value = "/formations/{id}" , method= RequestMethod.DELETE)
    public boolean deleteFormation (@PathVariable  Long id){
        formateurmetierImp.supprimerformation(id);
        return true;
    }
    @RequestMapping(value = "/formations/{id}" , method= RequestMethod.PUT)
    public boolean modifierFormation (@PathVariable  Long id,@RequestBody formation f){

        formateurmetierImp.modifierformation(id, f);
        return true;
    }

    @RequestMapping(value = "/countformations" , method= RequestMethod.GET)
    public long countFormation(){
        return formateurmetierImp.countformation();
    }

}
