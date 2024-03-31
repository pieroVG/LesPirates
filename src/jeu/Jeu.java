package jeu;

import java.util.Scanner;

import affichage.Affichage;
import joueurs.Couleurs;
import joueurs.Pions;
import plateau.Case;
import plateau.Plateau;

public class Jeu {
	private De de;
    private Plateau plateau;
    private Pions pionJack;
    private Pions pionBill;
    private Scanner scanner;
    private Affichage affichage; 
    private int nbCases = 30;
    
    public Jeu() {
    	de = new De();
        plateau = new Plateau(nbCases);
        pionJack = new Pions("Jack Le Borgne", Couleurs.ROUGE);
        pionBill = new Pions("Bill Jambe De Bois", Couleurs.BLEU);
        scanner = new Scanner(System.in);
        affichage = new Affichage();
    }
    
    private void tourPion(Pions pion) {
        affichage.afficherMessage("Appuyez sur Entrée pour lancer les dés...");
        scanner.nextLine();
        
        int res = de.resultatDes();
        affichage.afficherResultatDes(res); 
        pion.deplacer(res);
        affichage.afficherPosition(pion); 
        
        Case caseActuelle = plateau.getCases()[pion.getPosition()];
        if (caseActuelle != null) {
            affichage.afficherMessage("Effet de la case : " + caseActuelle.getType());
            caseActuelle.effet(pion);
        }
    }

    private void jouerTour() {
        tourPion(pionJack);
        if (pionJack.getPosition() >= nbCases-1) {
            return;
        }
        
        tourPion(pionBill);
        if (pionBill.getPosition() >= nbCases-1) {          
            return;
        }

    }

    public void commencerJeu() {
    	plateau.afficherPlateau();
        while (pionJack.getPosition() < nbCases-1 && pionBill.getPosition() < nbCases-1 && pionJack.getVie() > 0 && pionBill.getVie() > 0) {
            jouerTour();
            afficherPlateauGraphique();
        }
        
        if (pionJack.getPosition() >= nbCases-1 || pionBill.getVie() <= 0) {
            affichage.afficherMessage("Jack Le Borgne a gagné!"); 
        } else if (pionBill.getPosition() >= nbCases-1 || pionJack.getVie() <= 0) {
            affichage.afficherMessage("Bill Jambe De Bois a gagné!");
        }
    }
    
    
    public void afficherPlateauGraphique() {
        System.out.println("Plateau:");
        for (int i = nbCases-1; i > 0; i--) {
            if (pionJack.getPosition() == i && pionBill.getPosition() == i) {
                System.out.print("JB");
            } else if (pionJack.getPosition() == i) {
                System.out.print("J ");
            } else if (pionBill.getPosition() == i) {
                System.out.print("B ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 5 == 0) {
                System.out.println(); // Nouvelle ligne pour chaque ligne de 5 cases
            }
        }
    }
    
}



    
