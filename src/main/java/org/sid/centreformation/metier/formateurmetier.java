package org.sid.centreformation.metier;

import org.sid.centreformation.entities.formateur;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("formateurService")
public interface formateurmetier {
    public formateur saveFormateur (formateur f);
    public List<formateur> listFormateur();
    public Optional<formateur> getFormateur(Long id);
    public boolean supprimerformateur(Long id);
    public boolean modifierformateur(Long id,formateur f );

    public Long countformateur();
}
