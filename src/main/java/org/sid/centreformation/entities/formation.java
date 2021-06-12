package org.sid.centreformation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class formation implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String truck;
    private Date date;
    private int days;
    private String location;
    @ManyToMany(mappedBy = "formations", fetch = FetchType.LAZY)
    private Collection<participant> participants;

    @ManyToOne
    @JoinColumn
    private formateur formateur;

    public formation() {
    }
    public formation(formateur formateur) {
        this.formateur = formateur;
    }
    public formation( String name, String truck, Date date, int days, String location) {
        this.name = name;
        this.truck = truck;
        this.date = date;
        this.days = days;
        this.location = location;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTruck() {
        return truck;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(formateur formateur) {
        this.formateur = formateur;
    }
    @JsonIgnore
    public Collection<participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Collection<participant> participants) {
        this.participants = participants;
    }

}
