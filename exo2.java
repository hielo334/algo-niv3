package algoniv3;
import java.util.Scanner;

public class exo2 {

    public static int soustraire(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        System.out.print("b = ");
        int b = scanner.nextInt();

        // Calcul
        int resultat = soustraire(a, b); 

        // Affichage
        System.out.println("\nresultat = a - b");
        System.out.println("\nresultat vaut " + resultat);  
        
        scanner.close();
    }
}

        
