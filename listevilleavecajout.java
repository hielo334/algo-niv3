package algoniv3;

import java.util.Scanner; 
import java.util.Arrays;    // Pour utiliser Arrays

public class listevilleavecajout {
    public static void main(String[] args) {
        /*
         * INITIALISATION DES DONNÉES
         * Tableau des villes disponibles au démarrage du programme.
         * Chaque ville a un message d'accueil correspondant dans le tableau 'messages'.
         */
        String[] villes = {"Paris", "Londres", "Madrid", "Lisbonne", "Berlin"};
        
        /*
         * Tableau des messages d'accueil.
         * L'index de chaque message correspond à l'index de la ville dans 'villes'.
         */
        String[] messages = {
            "Bienvenue à Paris !",      // Index 0
            "Welcome to London !",      // Index 1
            "Bienvenido a Madrid !",    // Index 2
            "Bem-vindo a Lisboa !",     // Index 3
            "Willkommen in Berlin !"    // Index 4
        };
        
        Scanner sc = new Scanner(System.in);
        
        /*
         * BOUCLE PRINCIPALE DU PROGRAMME
         * Affiche un menu en boucle jusqu'à ce que l'utilisateur choisisse de quitter (option 3).
         */
        do {
            // Affichage du menu avec les options disponibles
            System.out.println("\nMenu :");
            System.out.println("1 - Visiter une ville");    
            System.out.println("2 - Ajouter une ville");   
            System.out.println("3 - Quitter");              
            System.out.print("Votre choix : ");             
            
            // Lecture du choix utilisateur (1, 2 ou 3)
            int menu = sc.nextInt();
            sc.nextLine();  // Nettoie le buffer
            
            /* OPTION 1 - VISITER UNE VILLE EXISTANTE */
            if (menu == 1) {
                System.out.println("\nChoisissez une ville :");
                
                // Boucle pour afficher toutes les villes avec leur index
                for (int i = 0; i < villes.length; i++) {
                    System.out.println(i + " - " + villes[i]);  // Format: "0 - Paris", "1 - Londres", etc.
                }
                
                // Gestion des erreurs si l'utilisateur ne saisit pas un nombre
                try {
                    int choix = sc.nextInt();  // Lit le numéro de ville choisi
                    
                    // Vérifie si l'index est valide (entre 0 et la taille du tableau - 1)
                    if (choix >= 0 && choix < villes.length) {
                        // Affiche le message correspondant à la ville choisie
                        System.out.println("\n" + messages[choix]);
                    } else {
                        // Message d'erreur si l'index est hors limites
                        System.out.println("Numéro invalide !");
                    }
                } catch (Exception e) {
                    // Si l'utilisateur saisit autre chose qu'un nombre
                    System.out.println("Erreur de saisie ! Veuillez entrer un nombre.");
                    sc.next();  // Vide le buffer erroné pour éviter une boucle infinie
                }
                
            /* OPTION 2 - AJOUTER UNE NOUVELLE VILLE */
            } else if (menu == 2) {
                // Demande le nom de la nouvelle ville
                System.out.print("\nNom de la nouvelle ville : ");
                String nouvelleVille = sc.nextLine();  // Lit toute la ligne (peut contenir des espaces)
                
                // Demande le message d'accueil associé
                System.out.print("Message d'accueil : ");
                String nouveauMessage = sc.nextLine();
                
                /*
                 * AGRANDISSEMENT DES TABLEAUX
                 * On utilise Arrays.copyOf() pour créer une nouvelle version des tableaux 
                 * avec une taille augmentée de 1.
                 * - villes devient villes.length + 1
                 * - messages devient messages.length + 1
                 */
                villes = Arrays.copyOf(villes, villes.length + 1);
                messages = Arrays.copyOf(messages, messages.length + 1);
                
                /*
                 * AJOUT DES NOUVELLES VALEURS
                 * On ajoute la nouvelle ville et son message à la dernière position
                 * (qui est à l'index villes.length - 1 après l'agrandissement)
                 */
                villes[villes.length - 1] = nouvelleVille;
                messages[messages.length - 1] = nouveauMessage;
                
                // Confirmation de l'ajout
                System.out.println("\"" + nouvelleVille + "\" a été ajoutée avec succès !");
                
            /* OPTION 3 - QUITTER LE PROGRAMME */
            } else if (menu == 3) {
                break;  // Sort de la boucle do-while
                
            /* OPTION INVALIDE (nombre autre que 1, 2 ou 3) */
            } else {
                System.out.println("Erreur : Choix invalide. Veuillez saisir 1, 2 ou 3.");
            }
            
        } while (true);  // Boucle infinie (quittée par le 'break' de l'option 3)
        
        System.out.println("\nAu revoir ! À bientôt pour de nouveaux voyages !");
        
        sc.close();
    }
}