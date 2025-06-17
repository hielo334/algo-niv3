package algoniv3;

import java.util.*;
import java.math.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class bliotheque {
    
        // ==================== AXO ALGO NIV I ==================== //
   

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

// Fonction pour effectuer le retrait
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

//SUITE !!!

//FAIT AVEC IA//

    // ==================== MATHÉMATIQUES ==================== //
    /**
     * Calcule la différence entre deux nombres
     */
    public static double difference(double a, double b) {
        return a - b;
    }
    
    /**
     * Calcule le produit de deux nombres
     */
    public static double produit(double a, double b) {
        return a * b;
    }
      
    /**
     * Calcule le pourcentage d'une valeur
     * @param valeur La valeur de base
     * @param pourcentage Le pourcentage à appliquer (ex: 10 pour 10%)
     */
    public static double calculerPourcentage(double valeur, double pourcentage) {
        return valeur * (pourcentage / 100);
    }
    
    /**
     * Augmente une valeur d'un certain pourcentage
     */
    public static double augmenterPourcentage(double valeur, double pourcentage) {
        return valeur * (1 + pourcentage/100);
    }
    
    /**
     * Diminue une valeur d'un certain pourcentage
     */
    public static double diminuerPourcentage(double valeur, double pourcentage) {
        return valeur * (1 - pourcentage/100);
    }
    
    /**
     * Calcule la factorielle d'un nombre entier
     */
    public static BigInteger factorielle(int n) {
        if(n < 0) throw new IllegalArgumentException("n doit être positif");
        BigInteger resultat = BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
            resultat = resultat.multiply(BigInteger.valueOf(i));
        }
        return resultat;
    }
    
    // ==================== MANIPULATION DE TEXTE ==================== //
    
    /**
     * Inverse une chaîne de caractères
     */
    public static String inverserString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Met la première lettre de chaque mot en majuscule
     */
    public static String capitaliser(String texte) {
        if(texte == null || texte.isEmpty()) return texte;
        
        String[] mots = texte.split(" ");
        StringBuilder resultat = new StringBuilder();
        
        for(String mot : mots) {
            if(!mot.isEmpty()) {
                resultat.append(Character.toUpperCase(mot.charAt(0)))
                       .append(mot.substring(1).toLowerCase())
                       .append(" ");
            }
        }
        
        return resultat.toString().trim();
    }
    
    // ==================== DATES ET HEURES ==================== //
    
    /**
     * Retourne la date et heure actuelle formatée
     */
    public static String dateHeureActuelle() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
    
    /**
     * Formate une date selon le pattern spécifié
     */
    public static String formaterDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
    
    /**
     * Calcule la différence en jours entre deux dates
     */
    public static long differenceJours(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
    
    // ==================== TABLEAUX ET COLLECTIONS ==================== //
    
    /**
     * Trouve la valeur maximale dans un tableau de doubles
     */
    public static double max(double[] tableau) {
        if(tableau == null || tableau.length == 0) {
            throw new IllegalArgumentException("Tableau vide ou null");
        }
        double max = tableau[0];
        for(double val : tableau) {
            if(val > max) max = val;
        }
        return max;
    }
    
    /**
     * Trouve la valeur minimale dans un tableau de doubles
     */
    public static double min(double[] tableau) {
        if(tableau == null || tableau.length == 0) {
            throw new IllegalArgumentException("Tableau vide ou null");
        }
        double min = tableau[0];
        for(double val : tableau) {
            if(val < min) min = val;
        }
        return min;
    }
    
    /**
     * Calcule la moyenne des valeurs d'un tableau
     */
    public static double moyenne(double[] tableau) {
        if(tableau == null || tableau.length == 0) {
            throw new IllegalArgumentException("Tableau vide ou null");
        }
        double somme = 0;
        for(double val : tableau) {
            somme += val;
        }
        return somme / tableau.length;
    }
    
    /**
     * Trie un tableau d'entiers par ordre croissant
     */
    public static void trier(int[] tableau) {
        Arrays.sort(tableau);
    }
    
    // ==================== CONVERSIONS ==================== //
    
    /**
     * Convertit un nombre en binaire
     */
    public static String versBinaire(int nombre) {
        return Integer.toBinaryString(nombre);
    }
    
    // ==================== UTILITAIRES DIVERS ==================== //
    
    /**
     * Génère un nombre aléatoire entre min et max (inclus)
     */
    public static int nombreAleatoire(int min, int max) {
        if(min >= max) throw new IllegalArgumentException("Max doit être > min");
        return new Random().nextInt(max - min + 1) + min;
    }
    
    /**
     * Vérifie si un nombre est premier
     */
    public static boolean estPremier(int nombre) {
        if(nombre <= 1) return false;
        if(nombre <= 3) return true;
        if(nombre % 2 == 0 || nombre % 3 == 0) return false;
        
        for(int i = 5; i * i <= nombre; i += 6) {
            if(nombre % i == 0 || nombre % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Arrondit un nombre à un nombre spécifié de décimales
     */
    public static double arrondir(double valeur, int decimales) {
        if(decimales < 0) throw new IllegalArgumentException("Nombre de décimales invalide");
        BigDecimal bd = new BigDecimal(Double.toString(valeur));
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}


//*importation */

//import *com.mabibliotheque.Utils;*

//*utilisation */
// Mathématiques
/*   double total = Utils.somme(5.5, 3.2);
double pourcentage = Utils.calculerPourcentage(200, 15);

   Texte
boolean palindrome = Utils.estPalindrome("kayak");
String capitalise = Utils.capitaliser("bonjour le monde");

   Dates
String maintenant = Utils.dateHeureActuelle();

   Tableaux
double[] valeurs = {1.5, 2.3, 4.7};
double max = Utils.max(valeurs);

   Conversions
double fahrenheit = Utils.celsiusVersFahrenheit(25); 
*/