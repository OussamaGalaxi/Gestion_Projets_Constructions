
import model.Employe;
import model.Projet;
import model.RessourceMaterielle;
import model.Tache;
import service.GestionProjetService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionProjetService gestionProjetService = new GestionProjetService();
        Scanner scanner = new Scanner(System.in);

        boolean continuer = true;

        while (continuer) {
            System.out.println("\nMenu de gestion des projets de construction");
            System.out.println("1. Créer un projet");
            System.out.println("2. Modifier un projet");
            System.out.println("3. Supprimer un projet");
            System.out.println("4. Afficher les projets");
            System.out.println("5. Gérer les tâches");
            System.out.println("6. Gérer les employés");
            System.out.println("7. Gérer les ressources matérielles");
            System.out.println("8. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom du projet: ");
                    String nomProjet = scanner.nextLine();
                    System.out.print("Description du projet: ");
                    String descriptionProjet = scanner.nextLine();
                    Projet projet = new Projet(nomProjet, descriptionProjet);
                    gestionProjetService.ajouterProjet(projet);
                    System.out.println("Projet créé.");
                    break;

                case 2:
                    // Ajouter la logique pour modifier un projet
                    break;

                case 3:
                    // Ajouter la logique pour supprimer un projet
                    break;

                case 4:
                    System.out.println("Liste des projets:");
                    for (Projet p : gestionProjetService.listerProjets()) {
                        System.out.println("Nom: " + p.getNom() + ", Description: " + p.getDescription());
                    }
                    break;

                case 5:
                    // Ajouter la gestion des tâches
                    break;

                case 6:
                    // Ajouter la gestion des employés
                    break;

                case 7:
                    // Ajouter la gestion des ressources matérielles
                    break;

                case 8:
                    continuer = false;
                    break;

                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }

        scanner.close();
    }
}
