package com.restApi.springboot.springbootpostgresdocker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Projet extends Projetaudit{

    @Id
    @SequenceGenerator(
            name = "projet_id_sequence",
            sequenceName = "projet_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "projet_id_sequence"
    )
    private int idProjet;
    private int idTaches;
    private String nomProjet;
    private Date dateDebut;
    private Date dateFin;

    public int getIdProjet() {
        return idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public int getIdTaches() {
        return idTaches;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public void setIdTaches(int idTaches) {
        this.idTaches = idTaches;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
