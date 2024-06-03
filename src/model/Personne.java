package model;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age);
    }

}
