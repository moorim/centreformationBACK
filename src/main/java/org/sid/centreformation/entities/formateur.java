package org.sid.centreformation.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class formateur  implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String familyname;
    private String email;
    private String adresse;
    private String domaine;
    @OneToMany(mappedBy = "formateur",fetch = FetchType.LAZY)
    private Collection<formation> formations;
    public formateur() {
    }

    public formateur( String firstname, String familyname) {

        this.firstname = firstname;
        this.familyname = familyname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
}

