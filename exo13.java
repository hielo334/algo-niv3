package algoniv3;

import java.util.Scanner;

public class exo13 {
    
    // Fonction de conversion
    public static double convertirEnMetres(int centimetres) {
        return centimetres / 100.0;
    }
    
    // Fonction d'affichage du résultat
    public static void afficherConversion(int cm, double m) {
        System.out.println("\n" + cm + " cm vaut " + m + " m");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                // saisi
                System.out.println("Donner une taille en centimètre (ou 'q' pour quitter) ?");
                System.out.print("\n");
                
                // lire l'entrée
                String input = scanner.next();
                
                // Vérifier si l'utilisateur veut quitter
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Fin du programme.");
                    break;
                }
                
                // Convertir l'entrée en entier
                int centimetres = Integer.parseInt(input);
                
                // Conversion et affichage
                double metres = convertirEnMetres(centimetres);
                afficherConversion(centimetres, metres);
                
            } catch (NumberFormatException e) {
                System.out.println("\nErreur : Veuillez entrer un nombre entier valide ou 'q' pour quitter");
            }
        }
        scanner.close();
    }
}