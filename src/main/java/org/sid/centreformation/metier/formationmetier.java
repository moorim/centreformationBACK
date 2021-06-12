package org.sid.centreformation.metier;

import org.sid.centreformation.entities.formation;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("formationService")
public interface formationmetier {
    public formation saveFormation (formation f);
    public List<formation> listFormation();
    public Optional<formation> getFormation(Long id);
    public boolean supprimerformation(Long id);
    public boolean modifierformation(Long id,formation f );
    public Long countformation();
}
