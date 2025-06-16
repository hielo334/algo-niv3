/* 
M’afficher une liste de ville , Paris, Londres, Madrid, Berlin, Lisbonne, me les afficher sous forme de liste.

Créer une méthode permettant de chercher une ville dans la liste, si il ne trouve pas la ville entrer en Scanner, afficher “Cette ville ne figure pas sur la liste”.

Créer une méthode qui permet d’ajouter une ville dans votre liste.
/* */

package algoniv3;

import java.util.Scanner;

public class listeville {
    public static void main(String[] args) {
        // Tableau des noms de villes
        String[] villes = {"Paris", "Londres", "Madrid", "Lisbonne", "Berlin"};
        
        // Tableau des messages d'accueil correspondants (même ordre que les villes)
        String[] messages = {
            "Bienvenue à Paris !",
            "Welcome to London !",
            "Bienvenido a Madrid !",
            "Bem-vindo a Lisboa !",
            "Willkommen in Berlin !"
        };
        
        Scanner sc = new Scanner(System.in);
        String reponse; // Variable pour stocker la réponse de l'utilisateur
        
        // Boucle principale du programme
        do {
            // Affichage de la liste des villes avec leurs numéros
            System.out.println("Choisissez une ville :");
            for (int i = 0; i < villes.length; i++) {
                System.out.println(i + " - " + villes[i]); // Format: "0 - Paris"
            }
            
            try {
                // Lecture du choix de l'utilisateur
                int choix = sc.nextInt();
                
                // Vérification que le choix est dans les limites du tableau
                if (choix >= 0 && choix < villes.length) {
                    // Affichage du message correspondant à la ville choisie
                    System.out.println(messages[choix]);
                } else {
                    // Message si le numéro est hors limites
                    System.out.println("Numéro invalide !");
                }
            } catch (Exception e) {
                // Gestion des erreurs de saisie (si l'utilisateur n'entre pas un nombre)
                System.out.println("Erreur de saisie !");
                sc.next(); 
            }
            
            // Demande si l'utilisateur veut continuer
            System.out.print("Continuer ? (O/N) ");
            reponse = sc.next(); 
            
        } while (reponse.equalsIgnoreCase("O")); // Continue tant que la réponse est "O" ou "o"
        
        // Message de fin
        System.out.println("Au revoir !");
        
        sc.close();
    }
}
