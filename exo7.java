package algoniv3;

import java.util.Scanner;

public class exo7 {
    
    // Fonction
    public static String getResponseMessage(boolean speaksEnglish) {
        return speaksEnglish ? "\"Nice to meet you\"" : "\"So learn english !\"";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Affichage 
        System.out.println("Do you speak english (Y/N)?");
        System.out.print("\n");  
        
        // Lecture de la réponse (Y/N)
        String reponse = scanner.nextLine().toUpperCase();
        
        // réponse et conversion en bool
        boolean speaksEnglish = reponse.equals("Y");
        
        // résultat avec la fonction
        System.out.println(getResponseMessage(speaksEnglish));
        
        scanner.close();
    }
}