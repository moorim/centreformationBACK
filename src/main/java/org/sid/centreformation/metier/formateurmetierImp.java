package org.sid.centreformation.metier;

import org.sid.centreformation.entities.formateur;
import org.sid.centreformation.metier.formateurmetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("formateurService")
public class formateurmetierImp implements formateurmetier {
    @Autowired
    private org.sid.centreformation.Dao.formateurRepository formateurRepository;

    @Override
    public formateur saveFormateur(formateur f) {
        return formateurRepository.save(f);
    }

    @Override
    public List<formateur> listFormateur() {
        return formateurRepository.findAll();
    }

    @Override
    public Optional<formateur> getFormateur(Long id) {
        return formateurRepository.findById(id);
    }

    @Override
    public boolean supprimerformateur(Long id) {
        formateurRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean modifierformateur(Long id,formateur f) {
        f.setId(id);
        formateurRepository.save(f);
        return true;
    }


    @Override
    public Long countformateur() {
        return formateurRepository.count();
    }

}
