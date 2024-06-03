package model;

public class RessourceMaterielle {
    private String nom;
    private int quantite;

    public RessourceMaterielle(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
