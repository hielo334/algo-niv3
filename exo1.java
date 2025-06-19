package algoniv3;
import java.util.Scanner;

public class exo1 { // Les noms de classes en Java doivent commencer par une majuscule (convention)
    
    // Fonction qui additionne
    public static int additionner(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lecture des entrées
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        System.out.print("b = ");
        int b = scanner.nextInt();
        
        // Utilisation de la fonction d'addition
        int resultat = additionner(a, b); // On utilise la variable déclarée dans la fonction
        
        System.out.println("Le résultat vaut " + resultat); // Affiche le résultat
        
        scanner.close();
    }
}