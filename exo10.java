package algoniv3;

import java.util.Scanner;

public class exo10 {
    
    // Fonction
    public static int poserQuestion(Scanner scanner, String question, String bonneReponse) {
        System.out.println(question);
        System.out.print("\n");
        String reponse = scanner.nextLine();
        
        if (reponse.equalsIgnoreCase(bonneReponse)) {
            System.out.println("Bonne réponse.\n");
            return 1;
        } else {
            System.out.println("Mauvaise réponse.\n");
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Tableau
        String[][] questions = {
            {"Question 1 : La terre est une planète ?", "Vrai"},
            {"Question 2 : La capitale de l'Espagne est Madrid ?", "Vrai"},
            {"Question 3 : Trump n'est pas le nouveau président ?", "Faux"},
            {"Question 4 : La tomate est un légume ?", "Faux"},
            {"Question 5 : Le blanc est une couleur ?", "Faux"}
        };
        
        // chaque question
        for (String[] q : questions) {
            score += poserQuestion(scanner, q[0], q[1]);
        }
        
        // résultat final
        System.out.println("Votre score final est : " + score + " sur 5.");
        
        scanner.close();
    }
}