package org.sid.centreformation.metier;

import org.sid.centreformation.entities.formation;
import org.sid.centreformation.metier.formationmetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("formationService")
public class formationmetierImp implements formationmetier {
    @Autowired
    private org.sid.centreformation.Dao.formationRepository formationRepository;
    @Override
    public formation saveFormation(formation f) {
        return formationRepository.save(f);
    }

    @Override
    public List<formation> listFormation() {
        return formationRepository.findAll();
    }

    @Override
    public Optional<formation> getFormation(Long id) {
        return formationRepository.findById(id);
    }

    @Override
    public boolean supprimerformation(Long id) {
        formationRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean modifierformation(Long id, formation f) {
        f.setId(id);
        formationRepository.save(f);
        return true;
    }



    @Override
    public Long countformation() {
        return formationRepository.count();
    }
}
