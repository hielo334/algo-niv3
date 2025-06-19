package algoniv3;
import java.util.ArrayList;
import java.util.Scanner;

public class fonction {
    
   
    public static void main(String[] args) {
        ArrayList<String> listeNoms = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Ajout de quelques noms de base
        bliotheque.ajouterNom(listeNoms, "David");
        bliotheque.ajouterNom(listeNoms, "Thomas");
        bliotheque.ajouterNom(listeNoms, "Cecile");
        
        // Menu interactif
        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Afficher la liste");
            System.out.println("2. Ajouter un nom");
            System.out.println("3. Supprimer un nom");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            
            int choix = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choix) {
                case 1:
                    bliotheque.afficherListe(listeNoms);
                    break;
                case 2:
                    System.out.print("Entrez le nom à ajouter : ");
                    String nomAjouter = scanner.nextLine();
                    bliotheque.ajouterNom(listeNoms, nomAjouter);
                    break;
                case 3:
                    System.out.print("Entrez le nom à supprimer : ");
                    String nomSupprimer = scanner.nextLine();
                    // Utilisation de la fonction de suppression
                    bliotheque.supprimerNom(listeNoms, nomSupprimer);
                    // Ou utiliser la version alternative :
                    // parcourirEtSupprimer(listeNoms, nomSupprimer);
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}