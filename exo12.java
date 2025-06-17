package algoniv3;

import java.util.Scanner;

public class exo12 {
    
    // Fonction calculer le prix 
    public static double calculerPrixReduit(double prix, double reduction) {
        return prix * (1 - reduction / 100);
    }
    
    // afficher le résultat formaté
    public static void afficherResultat(double reduction, double prixReduit) {
        System.out.println("\nPrix après réduction de " + reduction + "% :");
        System.out.printf("\n%.2f", prixReduit);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // le prix
            System.out.println("Votre prix ?");
            System.out.print("\n");
            double prix = scanner.nextDouble();
            
            // la réduction
            System.out.println("Votre réduction (en pourcentage %) ?");
            System.out.print("\n");
            double reduction = scanner.nextDouble();
            
            // Calculer
            double prixReduit = calculerPrixReduit(prix, reduction);
            afficherResultat(reduction, prixReduit);
            
        } catch (Exception e) {
            System.out.println("\nErreur : Veuillez entrer des valeurs numériques valides");
        } finally {
            scanner.close();
        }
    }
}