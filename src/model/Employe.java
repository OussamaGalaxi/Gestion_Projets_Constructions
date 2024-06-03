package model;

public class Employe extends Personne{

    private String poste;

    public Employe(String nom, String prenom,int age , String poste) {
        super(nom,prenom,age);
        this.poste = poste;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
