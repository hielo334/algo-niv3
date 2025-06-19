package algoniv3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class bliotheque {
    
        // ==================== FONCTIONS ALGO NIV I ==================== //
   
// Fonction qui affiche les valeurs d'un tableau
    public static void afficherTableau(int[] tableau) {
        System.out.print(",");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(",");
    }
    
 // Fonction pour afficher la liste
    public static void afficherListe(ArrayList<String> liste) {
        if (liste.isEmpty()) {
            System.out.println("La liste est vide.");
        } else {
            System.out.println("Contenu de la liste :");
            for (int i = 0; i < liste.size(); i++) {
                System.out.println((i+1) + ". " + liste.get(i));
            }
        }
    }
    
    // Fonction pour ajouter un nom à la liste
    public static void ajouterNom(ArrayList<String> liste, String nom) {
        liste.add(nom);
        System.out.println(nom + " a été ajouté à la liste.");
    }
    
    // Fonction pour supprimer un nom s'il existe
    public static void supprimerNom(ArrayList<String> liste, String nom) {
        if (liste.contains(nom)) {
            liste.remove(nom);
            System.out.println(nom + " a été supprimé de la liste.");
        } else {
            System.out.println(nom + " n'existe pas dans la liste.");
        }
    }
    
    // Fonction pour parcourir et supprimer un nom
    public static void parcourirEtSupprimer(ArrayList<String> liste, String nom) {
        boolean trouve = false;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equalsIgnoreCase(nom)) {
                liste.remove(i);
                System.out.println(nom + " a été supprimé de la liste.");
                trouve = true;
                i--; // Nécessaire car la taille de la liste a diminué
            }
        }
        if (!trouve) {
            System.out.println(nom + " n'a pas été trouvé dans la liste.");
        }
    }
    


//Fonction afficher liste

  public static void afficherListe(List<String> list) {
        System.out.println("\nListe:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

// Fonction qui additionne
public static int additionner(int a, int b) {
    return a + b;
}

// Fonction qui soustrait
public static int soustraire(int a, int b) {
    return a - b;
}

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

// Fonction qui présente une personne avec son prénom et son âge
public static String Presentation(String prenom, int age) {
    return "Je m'appelle " + prenom + ", j'ai " + age + " ans";
}

// Fonction qui retourne un message en fonction de la langue parlée
public static String getResponseMessage(boolean speaksEnglish) {
    return speaksEnglish ? "\"Nice to meet you\"" : "\"So learn english !\"";
}

// Fonction qui vérifie si deux mots de passe sont identiques
public static boolean verifierMotDePasse(String mdp1, String mdp2) {
    return mdp1.equals(mdp2);
}

// Fonction qui génère un message de confirmation d'inscription
public static String genererConfirmation(String prenom, String nom, String email) {
    return "Merci " + prenom + " " + nom.toUpperCase() + 
           ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + email;
}

// Fonction qui vérifie les identifiants de connexion
public static boolean verifierConnexion(String emailEnregistre, String mdpEnregistre, 
                                      String emailSaisi, String mdpSaisi) {
    return emailEnregistre.equals(emailSaisi) && mdpEnregistre.equals(mdpSaisi);
}

// Fonction qui pose une question et vérifie la réponse
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

// Fonction pour vérifier si le retrait est possible
public static boolean retraitAutorise(int solde, int montant) {
    return montant > 0 && montant <= solde;
}

// Fonction effectué le retrait
public static int effectuerRetrait(int solde, int montant) {
    return solde - montant;
}

// Fonction calculer le prix réduit
public static double calculerPrixReduit(double prix, double reduction) {
    return prix * (1 - reduction / 100);
}

// Fonction qui affiche le résultat formaté
public static void afficherResultat(double reduction, double prixReduit) {
    System.out.println("\nPrix après réduction de " + reduction + "% :");
    System.out.printf("\n%.2f", prixReduit);
}

// Fonction de conversion de centimètres en mètres
public static double convertirEnMetres(int centimetres) {
    return centimetres / 100.0;
}

// Fonction d'affichage du résultat de conversion
public static void afficherConversion(int cm, double m) {
    System.out.println("\n" + cm + " cm vaut " + m + " m");
}

// Fonction qui évalue une expression booléenne complexe
public static boolean evaluerExpression(boolean A, boolean B, boolean C) {
    return A || B && !C;
}

// Fonction qui lit une valeur booléenne depuis l'entrée utilisateur
public static boolean lireBooleen(Scanner scanner, String message) {
    while (true) {
        try {
            System.out.println(message);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("TRUE")) return true;
            if (input.equals("FALSE")) return false;
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Erreur : Veuillez entrer TRUE ou FALSE");
        }
    }
}
}

/** POUR INTÉGRER :

 1. COPIEZ FONCTIONS DANS VOTRE CLASSE
    - Coller l'ensemble des méthodes statiques dans votre classe
    - Ou créer une classe utilitaire séparée contenant ces méthodes

 2. POUR UTILISER LES FONCTIONS:
    - Appelez-les directement si elles sont dans la même classe
    - Ou utilisez le nom de classe si dans une classe utilitaire:
      NomClasse.nomFonction(parametres);

 3. EXEMPLE D'UTILISATION:
    - Pour les opérations mathématiques:
      int resultat = additionner(5, 3);

    - Pour les vérifications:
      boolean valide = verifierMotDePasse("mdp1", "mdp2");

    - Pour les interactions utilisateur:
      int score = poserQuestion(scanner, "Question?", "Réponse");

 4. POUR LES FONCTIONS AVEC AFFICHAGE:
    - Certaines fonctions comme afficherResultat() contiennent déjà
      des System.out.println(), vous n'avez pas besoin d'ajouter l'affichage

 5. ADAPTATION :
    - Modifiez les types de retour ou paramètres si besoin
    - Ajoutez des try-catch pour la gestion des erreurs
*//* */
