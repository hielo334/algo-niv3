package algoniv3;

import java.util.Scanner;

public class exo9 {
    
    // Fonction
    public static boolean verifierConnexion(String emailEnregistre, String mdpEnregistre, 
                                          String emailSaisi, String mdpSaisi) {
        return emailEnregistre.equals(emailSaisi) && mdpEnregistre.equals(mdpSaisi);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
            // Phase d'inscription
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
            
            System.out.println("Confirmer votre mot de passe ?");
            System.out.print("\n");
            String confirmationMotDePasse = scanner.nextLine();
            
            if (!motDePasse.equals(confirmationMotDePasse)) {
                System.out.println("Inscription annulée");
            } else {
                System.out.println("Merci " + prenom + " " + nom.toUpperCase() + 
                    ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + email);
                
                // Phase de connexion
                System.out.println("\nPour vous connecter, renseignez votre email ?");
                System.out.print("\n");
                String emailConnexion = scanner.nextLine();
                
                System.out.println("Renseignez votre mot de passe ?");
                System.out.print("\n");
                String motDePasseConnexion = scanner.nextLine();
                
                if (verifierConnexion(email, motDePasse, emailConnexion, motDePasseConnexion)) {
                    System.out.println("\nConnexion réussie. Bienvenue " + prenom + " !");
                } else {
                    System.out.println("\nConnexion refusée");
                }
            }
        
            scanner.close();
        
    }
}