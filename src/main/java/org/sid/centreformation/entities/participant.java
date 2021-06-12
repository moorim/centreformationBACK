package org.sid.centreformation.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
public class participant implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String Firstname ;
    private String familyname;
    private String Adresse;
    private String email;
    private String poste;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "Formation_Participant",
            joinColumns = {
                    @JoinColumn(name = "participant_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "formation_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Collection<formation> formations;

    public participant() {
    }

    public participant(String firstname, String familyname, String adresse, String email, String poste) {
        Firstname = firstname;
        this.familyname = familyname;
        Adresse = adresse;
        this.email = email;
        this.poste = poste;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Collection<formation> getFormations() {
        return formations;
    }

    public void setFormations(List<formation> formations) {
        this.formations = formations;
    }
}
