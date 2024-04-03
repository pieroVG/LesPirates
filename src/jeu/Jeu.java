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
    
    private void tourPion(Pions pion, Pions adversaire) {
        affichage.lancerDe();
        scanner.nextLine();
        
        int res = de.resultatDes();
        affichage.afficherResultatDes(res); 
        pion.deplacer(res);
        
        Case caseActuelle = plateau.getCases()[pion.getPosition()];
        if (caseActuelle != null) {
            affichage.afficherTypeCase(caseActuelle);
            affichage.afficherEffetCase(caseActuelle.effet(pion, adversaire, plateau));
        }
        
        affichage.afficherPosition(pion); 
        affichage.afficherPV(pion);
    }

    private void jouerTour() {
        tourPion(pionJack, pionBill);
        if (pionJack.getPosition() >= nbCases-1) {
            return;
        }
        
        tourPion(pionBill, pionJack);
        if (pionBill.getPosition() >= nbCases-1) {          
            return;
        }

    }

    public void commencerJeu() {
    	affichage.afficherPlateau(plateau.getCases());
        while (pionJack.getPosition() < nbCases-1 && pionBill.getPosition() < nbCases-1 && pionJack.getVie() > 0 && pionBill.getVie() > 0) {
            jouerTour();
            affichage.afficherPlateauGraphique(plateau, pionJack, pionBill);
        }
        
        if (pionJack.getPosition() >= nbCases-1 || pionBill.getVie() <= 0) {
        	affichage.afficherFinDeJeu(pionJack);
        } else if (pionBill.getPosition() >= nbCases-1 || pionJack.getVie() <= 0) {
            affichage.afficherFinDeJeu(pionBill);
        }
    }
    

    
}



    
