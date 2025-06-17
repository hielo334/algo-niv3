package algoniv3;

import java.util.Scanner;

public class exo5 {
    
    // Fonction calculer (A * B) / C
    public static int calculerEquation(int A, int B, int C) {
        return (A * B) / C;
    }
    
    // Fonction déterminer si le résultat est supérieur, inférieur ou égal à 10
    public static String comparerA10(int valeur) {
        if (valeur > 10) {
            return "superieur";
        } else if (valeur < 10) {
            return "inferieur";
        } else {
            return "egal à 10";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des entiers
        System.out.print("A = ");
        int A = scanner.nextInt();

        System.out.print("B = ");
        int B = scanner.nextInt();

        System.out.print("C = ");
        int C = scanner.nextInt();

        // Calcul de l'équation en utilisant la fonction
        int equation = calculerEquation(A, B, C);

        // Affichage de l'équation et du résultat
        System.out.println("\nequation = (A * B) / C");
        System.out.println("\nequation = " + equation);

        // Comparaison avec 10 en utilisant la fonction
        System.out.println("\nequation est " + comparerA10(equation));

        scanner.close();
    }
}