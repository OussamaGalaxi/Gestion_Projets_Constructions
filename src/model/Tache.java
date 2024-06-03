package model;

import java.util.ArrayList;
import java.util.List;

public class Tache {
    private String description;
    private List<Employe> employes;
    private List<RessourceMaterielle> ressources;
    private int dureeEstimee;

    public Tache(String description, int dureeEstimee) {
        this.description = description;
        this.dureeEstimee = dureeEstimee;
        this.employes = new ArrayList<>();
        this.ressources = new ArrayList<>();
    }

    // Getters et setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void ajouterEmploye(Employe employe) {
        this.employes.add(employe);
    }

    public void supprimerEmploye(Employe employe) {
        this.employes.remove(employe);
    }

    public List<RessourceMaterielle> getRessources() {
        return ressources;
    }

    public void ajouterRessource(RessourceMaterielle ressource) {
        this.ressources.add(ressource);
    }

    public void supprimerRessource(RessourceMaterielle ressource) {
        this.ressources.remove(ressource);
    }

    public int getDureeEstimee() {
        return dureeEstimee;
    }

    public void setDureeEstimee(int dureeEstimee) {
        this.dureeEstimee = dureeEstimee;
    }
}
