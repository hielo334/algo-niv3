package algoniv3;

import java.util.Scanner;

public class exo8 {
    
    // Fonction 
    public static boolean verifierMotDePasse(String mdp1, String mdp2) {
        return mdp1.equals(mdp2);
    }
    
    // Fonction 
    public static String genererConfirmation(String prenom, String nom, String email) {
        return "Merci " + prenom + " " + nom.toUpperCase() + 
               ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + email;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demande des informations avec le format exact demandé
        System.out.println("Votre prénom ?");
        System.out.print("\n");
        String prenom = scanner.nextLine();
        
        System.out.println("Votre nom ?");
        System.out.print("\n");
        String nom = scanner.nextLine();
        
        System.out.println("Votre adresse ?");
        System.out.print("\n");
        String email = scanner.nextLine();
        
        System.out.println("Votre mot de passe ?");
        System.out.print("\n");
        String motDePasse = scanner.nextLine();
        
        // Boucle pour la confirmation du mot de passe
        boolean confirmationCorrecte = false;
        int tentatives = 3;
        
        while (!confirmationCorrecte && tentatives > 0) {
            System.out.println("Confirmer votre mot de passe ?");
            System.out.print("\n");
            String confirmationMotDePasse = scanner.nextLine();
            
            if (verifierMotDePasse(motDePasse, confirmationMotDePasse)) {
                confirmationCorrecte = true;
                System.out.println(genererConfirmation(prenom, nom, email));
            } else {
                tentatives--;
                if (tentatives > 0) {
                    System.out.println("Erreur de confirmation. Il vous reste " + tentatives + " tentative(s).");
                }
            }
        }
        
        if (!confirmationCorrecte) {
            System.out.println("Inscription annulée");
        }
        
        scanner.close();
    } 
}