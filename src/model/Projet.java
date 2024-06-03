package model;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    private String description;
    private List<Tache> taches;

    public Projet(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.taches = new ArrayList<>();
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void ajouterTache(Tache tache) {
        this.taches.add(tache);
    }

    public void supprimerTache(Tache tache) {
        this.taches.remove(tache);
    }
}
