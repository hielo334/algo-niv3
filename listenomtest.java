package algoniv3;

import java.util.ArrayList;
import java.util.List;

public class listenom {
    
    

    
    
    public static void main (String[] args) {
        // Création d'une liste
        List<String> nom = new ArrayList<>();
        nom.add("David");
        nom.add("Thomas");
        nom.add("Cécile");
        
        
        bliotheque.afficherListe(nom);
        
        // Ajout d'un nom
        nom.add("Fred");
        
        
        System.out.println("\nAprès ajout:");
        bliotheque.afficherListe(nom);
    }
}