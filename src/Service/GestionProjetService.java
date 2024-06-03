package service;

import model.Projet;
import model.Tache;
import model.Employe;
import model.RessourceMaterielle;

import java.util.ArrayList;
import java.util.List;

public class GestionProjetService {
    private List<Projet> projets;
    private List<Employe> employesDisponibles;
    private List<RessourceMaterielle> ressourcesDisponibles;

    public GestionProjetService() {
        this.projets = new ArrayList<>();
        this.employesDisponibles = new ArrayList<>();
        this.ressourcesDisponibles = new ArrayList<>();
    }

    public void ajouterProjet(Projet projet) {
        projets.add(projet);
    }

    public void modifierProjet(Projet projet, String nouveauNom, String nouvelleDescription) {
        projet.setNom(nouveauNom);
        projet.setDescription(nouvelleDescription);
    }

    public void supprimerProjet(Projet projet) {
        projets.remove(projet);
    }

    public List<Projet> listerProjets() {
        return projets;
    }

    public void ajouterEmploye(Employe employe) {
        employesDisponibles.add(employe);
    }

    public void supprimerEmploye(Employe employe) {
        employesDisponibles.remove(employe);
    }

    public List<Employe> listerEmployesDisponibles() {
        return employesDisponibles;
    }

    public void ajouterRessource(RessourceMaterielle ressource) {
        ressourcesDisponibles.add(ressource);
    }

    public void supprimerRessource(RessourceMaterielle ressource) {
        ressourcesDisponibles.remove(ressource);
    }

    public List<RessourceMaterielle> listerRessourcesDisponibles() {
        return ressourcesDisponibles;
    }

    public void attribuerEmployeATache(Tache tache, Employe employe) {
        if (employesDisponibles.contains(employe)) {
            tache.ajouterEmploye(employe);
            employesDisponibles.remove(employe);
        } else {
            System.out.println("Employé non disponible.");
        }
    }

    public void attribuerRessourceATache(Tache tache, RessourceMaterielle ressource, int quantite) {
        if (ressourcesDisponibles.contains(ressource) && ressource.getQuantite() >= quantite) {
            tache.ajouterRessource(new RessourceMaterielle(ressource.getNom(), quantite));
            ressource.setQuantite(ressource.getQuantite() - quantite);
        } else {
            System.out.println("Ressource non disponible ou quantité insuffisante.");
        }
    }

    public int calculerDureeEstimeeTache(Tache tache) {
        // Cette méthode peut être plus complexe en fonction des ressources et des employés
        return tache.getDureeEstimee();
    }
}
