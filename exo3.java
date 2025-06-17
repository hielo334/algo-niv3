package algoniv3;

import java.util.Scanner;

public class exo3 {
    
    // Fonction pour effectuer l'addition
    public static int addition(int a, int b) {
        return a + b;
    }
    
    // Fonction pour vérifier si un nombre est pair ou impair
    public static String pairOuImpair(int nombre) {
        if (nombre % 2 == 0) {
            return "pair";
        } else {
            return "impaire";
        }
    }
    
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        // valeurs de a et b
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        // addition en utilisant la fonction
        int resultat = addition(a, b);

        // équation et le résultat
        System.out.println("\nresultat = a + b");
        System.out.println("\nresultat = " + resultat);

        System.out.println("\nresultat est " + pairOuImpair(resultat));

        
        scanner.close();
    }
}