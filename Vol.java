package algoniv3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Vol {
    // authentification
    private static final String LOGIN = "hutt";
    private static final String PASSWORD = "david";
    
    // stocker tous les vols
    private static String tousLesVols = "";
    
    // Format pour la saisie des dates
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    
    // attributs d'un vol
    private String departVille;
    private String departPays;
    private String arriveeVille;
    private String arriveePays;
    private LocalDateTime dateHeureDepart;
    private int dureeHeures;
    private int dureeMinutes;
    private int nombrePlaces;
    private double prixInitial;

    // Constructeur
    public Vol(String departVille, String departPays, String arriveeVille, String arriveePays,
              LocalDateTime dateHeureDepart, int dureeHeures, int dureeMinutes, 
              int nombrePlaces, double prixInitial) {
        this.departVille = departVille;
        this.departPays = departPays;
        this.arriveeVille = arriveeVille;
        this.arriveePays = arriveePays;
        this.dateHeureDepart = dateHeureDepart;
        this.dureeHeures = dureeHeures;
        this.dureeMinutes = dureeMinutes;
        this.nombrePlaces = nombrePlaces;
        this.prixInitial = prixInitial;
    }

    
     // Calcule l'heure d'arrivée en ajoutant la durée du vol
     
    public LocalDateTime getDateHeureArrivee() {
        return dateHeureDepart.plusHours(dureeHeures).plusMinutes(dureeMinutes);
    }

    /**
     * - +40% si départ dans moins d'1 semaine
     * - -40% si départ dans plus de 6 mois
     * - -10% si ≥150 places
     * - +10% si <100 places
     */
    public double getPrixAjuste() {
        double prix = prixInitial;
        LocalDateTime aujourdHui = LocalDateTime.now();

        // Ajustement basé sur la date
        long joursAvantDepart = ChronoUnit.DAYS.between(aujourdHui, dateHeureDepart);
        if (joursAvantDepart < 7) {
            prix *= 1.40;
        } else if (joursAvantDepart > 180) {
            prix *= 0.60;
        }

        // Ajustement basé sur les places
        if (nombrePlaces >= 150) {
            prix *= 0.90;
        } else if (nombrePlaces < 100) {
            prix *= 1.10;
        }

        return prix;
    }

    
                         //Affichage formaté d'un vol
     
    
    public String toString() {
        return String.format(
            "Vol de %s (%s) à %s (%s)\n" +
            "Départ: %s\nArrivée: %s\n" +
            "Durée: %dh %dmin\nPlaces: %d\n" +
            "Prix initial: %.2fEUR\nPrix ajusté: %.2fEUR\n",
            departVille, departPays, arriveeVille, arriveePays,
            dateHeureDepart.format(DATE_FORMATTER), 
            getDateHeureArrivee().format(DATE_FORMATTER),
            dureeHeures, dureeMinutes, nombrePlaces,
            prixInitial, getPrixAjuste()
        );
    }

    
                // Point d'entrée du programme
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Authentification
        System.out.println("=== CONNEXION AIRMESS ===");
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Mot de passe: ");
        String mdp = scanner.nextLine();
        
        if (!login.equals(LOGIN) || !mdp.equals(PASSWORD)) {
            System.out.println("Accès refusé !");
            scanner.close();
            return;
        }
        
        System.out.println("\nBienvenue dans le système de gestion des vols !");
        
        // Menu principal
        boolean continuer = true;
        while (continuer) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Ajouter un vol");
            System.out.println("2. Lister tous les vols");
            System.out.println("3. Quitter");
            System.out.print("Votre choix: ");
            
            int choix = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choix) {
                case 1:
                    ajouterVol(scanner);
                    break;
                case 2:
                    listerVols();
                    break;
                case 3:
                    continuer = false;
                    break;
                default:
                    System.out.println("Option invalide !");
            }
        }
        
        System.out.println("Merci d'avoir utilisé notre système !");
        scanner.close();
    }
    
    
             //Ajoute un nouveau vol après saisie des informations
    
    private static void ajouterVol(Scanner scanner) {
        System.out.println("\n--- NOUVEAU VOL ---");
        
        System.out.print("Ville de départ: ");
        String villeDepart = scanner.nextLine();
        System.out.print("Pays de départ: ");
        String paysDepart = scanner.nextLine();
        
        System.out.print("Ville d'arrivée: ");
        String villeArrivee = scanner.nextLine();
        System.out.print("Pays d'arrivée: ");
        String paysArrivee = scanner.nextLine();
        
        System.out.print("\nDate et heure de départ (format dd-MM-yyyy HH:MM): ");
        String dateDepartStr = scanner.nextLine();
        LocalDateTime dateDepart = LocalDateTime.parse(dateDepartStr, DATE_FORMATTER);
        
        System.out.print("\nDate et heure d'arrivée (format dd-MM-yyyy HH:MM): ");
        String dateArriveeStr = scanner.nextLine();
        LocalDateTime dateArrivee = LocalDateTime.parse(dateArriveeStr, DATE_FORMATTER);
        
        // Calcul de la durée du vol
        long dureeMinutesTotal = ChronoUnit.MINUTES.between(dateDepart, dateArrivee);
        int dureeH = (int) (dureeMinutesTotal / 60);
        int dureeM = (int) (dureeMinutesTotal % 60);
        
        System.out.print("\nNombre de places (80-200): ");
        int places = scanner.nextInt();
        if (places < 80 || places > 200) {
            System.out.println("Erreur: le nombre de places doit être entre 80 et 200 !");
            return;
        }
        
        System.out.print("Prix initial: ");
        double prix = scanner.nextDouble();
        scanner.nextLine(); 

        // Création du vol
        Vol nouveauVol = new Vol(
            villeDepart, paysDepart, 
            villeArrivee, paysArrivee,
            dateDepart, dureeH, dureeM,
            places, prix
        );
        
        // Ajout du vol à la chaîne
        tousLesVols += nouveauVol.toString() + "\n====================\n";
        System.out.println("\nVol ajouté avec succès !");
    }
    
    
      //Liste tous les vols
     
    private static void listerVols() {
        if (tousLesVols.isEmpty()) {
            System.out.println("Aucun vol enregistré.");
            return;
        }
        
        System.out.println("\n=== LISTE DES VOLS ===\n");
        System.out.println(tousLesVols);
    }
}