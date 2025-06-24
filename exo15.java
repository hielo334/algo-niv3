package algoniv3;
import java.util.Scanner;

public class exo15 {
    // Tableau des taux de conversion (EUR, USD, GBP)
    private static final double[][] TAUX_CONVERSION = {
        {1.0, 1.1382, 0.8563},    // EUR vers EUR, USD, GBP
        {1.0/1.1382, 1.0, 0.7523}, // USD vers EUR, USD, GBP
        {1.0/0.8563, 1.0/0.7523, 1.0}  // GBP vers EUR, USD, GBP
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        while (!quitter) {
            afficherMenu();
            
            // Demander la devise d'entrée
            String deviseEntree = demanderDevise(scanner, "Quel est votre monnaie ?");
            
            // Demander le montant
            double montant = demanderMontant(scanner);
            
            // Demander la devise de sortie
            String deviseSortie = demanderDevise(scanner, "Vous voulez la convertir en quelle devise ?");
            
            // Vérifier que les devises sont différentes
            while (deviseSortie.equals(deviseEntree)) {
                System.out.println("Attention: Vous ne pouvez pas convertir entre la même devise!");
                deviseSortie = demanderDevise(scanner, "Vous voulez la convertir en quelle devise ?");
            }
            
            // Effectuer la conversion
            double resultat = convertirDevise(montant, deviseEntree, deviseSortie);
            
            // Afficher le résultat
            System.out.printf("\nRésultat : %.2f %s = %.2f %s\n\n", 
                             montant, deviseEntree, resultat, deviseSortie);
            
            // Demander si l'utilisateur veut continuer
            System.out.println("Voulez-vous faire une autre conversion? (O/N)");
            String reponse = scanner.nextLine().toUpperCase();
            while (!reponse.equals("O") && !reponse.equals("N")) {
                System.out.println("Veuillez répondre par O (Oui) ou N (Non):");
                reponse = scanner.nextLine().toUpperCase();
            }
            quitter = reponse.equals("N");
        }
        
        System.out.println("Merci d'avoir utilisé le convertisseur de devises. Au revoir!");
        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("=== Convertisseur de devises ===");
        System.out.println("EUR : Euros");
        System.out.println("USD : Dollars américains");
        System.out.println("GBP : Livres sterling");
        System.out.println();
    }

    private static String demanderDevise(Scanner scanner, String message) {
        System.out.println(message + "\n");
        String devise = scanner.nextLine().toUpperCase();
        
        while (!devise.equals("EUR") && !devise.equals("USD") && !devise.equals("GBP")) {
            System.out.println("Devise non reconnue. Veuillez entrer EUR, USD ou GBP:");
            devise = scanner.nextLine().toUpperCase();
        }
        
        return devise;
    }

    private static double demanderMontant(Scanner scanner) {
        System.out.println("\nQuel est votre montant ?\n");
        while (!scanner.hasNextDouble()) {
            System.out.println("Veuillez entrer un nombre valide avec décimales (ex: 100.00):");
            scanner.next(); // consommer l'entrée invalide
        }
        double montant = scanner.nextDouble();
        scanner.nextLine(); // consommer le retour à la ligne
        return montant;
    }

    private static double convertirDevise(double montant, String deviseEntree, String deviseSortie) {
        // Obtenir les indices pour le tableau de conversion
        int indexEntree = getDeviseIndex(deviseEntree);
        int indexSortie = getDeviseIndex(deviseSortie);
        
        // Retourner le montant converti
        return montant * TAUX_CONVERSION[indexEntree][indexSortie];
    }

    private static int getDeviseIndex(String devise) {
        switch (devise) {
            case "EUR": return 0;
            case "USD": return 1;
            case "GBP": return 2;
            default: return -1; // ne devrait pas arriver
        }
    }
}