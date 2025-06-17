package algoniv3;

import java.util.Scanner;

public class exo14 {
    
    // Fonction
    public static boolean evaluerExpression(boolean A, boolean B, boolean C) {
        return A || B && !C;
    }
    
    // Fonction
    public static boolean lireBooleen(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine().trim().toUpperCase();
                if (input.equals("TRUE")) return true;
                if (input.equals("FALSE")) return false;
                throw new IllegalArgumentException();
            } catch (Exception e) {
                System.out.println("Erreur : Veuillez entrer TRUE ou FALSE");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Donner une valeur A OU B ET NON C");
        System.out.print("\n");
        
        boolean A = lireBooleen(scanner, "");
        boolean B = lireBooleen(scanner, "");
        boolean C = lireBooleen(scanner, "");
        
        boolean resultat = evaluerExpression(A, B, C);
        System.out.println("\nRésultat : " + resultat);
        
        scanner.close();
    }
}
        System.out.println("Entrez la valeur de A (true/false):"); // Lire les trois valeurs booléennes A, B et C
        boolean A = scanner.nextBoolean();
        
        System.out.println("Entrez la valeur de B (true/false):");
        boolean B = scanner.nextBoolean();
        
        System.out.println("Entrez la valeur de C (true/false):");
        boolean C = scanner.nextBoolean();
        
        System.out.println(); // Ligne vide