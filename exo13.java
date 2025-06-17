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
        
        try {
            // saisi
            System.out.println("Donner une taille en centimètre ?");
            System.out.print("\n");
            
           // lire l'entée
            int centimetres = scanner.nextInt();
            
            // Conversion et affichage
            double metres = convertirEnMetres(centimetres);
            afficherConversion(centimetres, metres);
            
        } catch (Exception e) {
            System.out.println("\nErreur : Veuillez entrer un nombre entier valide");
        } finally {
            scanner.close();
        }
    }
}