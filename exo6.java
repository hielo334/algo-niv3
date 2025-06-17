package algoniv3;

import java.util.Scanner;

public class exo6 {
    
    // Fonction
    public static String Presentation(String prenom, int age) {
        return "Je m'appelle " + prenom + ", j'ai " + age + " ans";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // lire le prénom
        System.out.print("prenom = ");
        String prenom = scanner.nextLine();
        
        // lire l'âge
        System.out.print("\nage = ");
        int age = scanner.nextInt();
        
        System.out.println("\n" + Presentation(prenom, age));
        
        scanner.close();
    }
}