package algoniv3;

import java.util.Scanner;

public class exo11 {
    
    // Fonction pour vérifier si le retrait est possible
    public static boolean retraitAutorise(int solde, int montant) {
        return montant > 0 && montant <= solde;
    }
    
    // Fonction pour effectuer le retrait
    public static int effectuerRetrait(int solde, int montant) {
        return solde - montant;
    }
    
    public static void main(String[] args) {
        int solde = 3000;
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Bonjour, combien voulez-vous retirer ?");
            System.out.print("\n");
            int montant = scanner.nextInt();
            
            if (retraitAutorise(solde, montant)) {
                solde = effectuerRetrait(solde, montant);
                System.out.println("\nOpération acceptée. Nouveau solde : " + solde + " EUR");
            } else {
                System.out.println("\nOpération refusée, fond insuffisant !");
            }
            
        } catch (Exception e) {
            System.out.println("\nErreur : Veuillez entrer un montant valide");
        } finally {
            scanner.close();
        }
    }
}