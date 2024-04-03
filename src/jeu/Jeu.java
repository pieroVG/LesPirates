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
    	String deplacement;
        affichage.lancerDe();
        scanner.nextLine();
        
        int res = de.resultatDes();
        affichage.afficherResultatDes(res); 
        
        deplacement = pion.deplacer(res);
        if (deplacement != null) {
            affichage.afficherMessage(deplacement);
        }
        
        Case caseActuelle = plateau.getCases()[pion.getPosition()];
        affichage.afficherTypeCase(caseActuelle);
        affichage.afficherEffetCase(caseActuelle.effet(pion, adversaire, plateau));
        affichage.afficherImmunite(pion);

        affichage.afficherPosition(pion); 
        affichage.afficherPV(pion);
    }

    private void jouerTour() {
        tourPion(pionJack, pionBill);
        if (estTermine(pionJack) || estMort(pionJack)) {
            return;
        }
        
        tourPion(pionBill, pionJack);
    }

    private boolean estMort(Pions pion) {
        if (pion.getVie() <= 0) {
            affichage.afficherMessage(pion.getNom() + " est mort !");
            return true;
        }
        return false;
    }

    private boolean estTermine(Pions pion) {
        if (pion.getPosition() >= nbCases-1) {
            return true;
        }
        return false;
    }

    public void commencerJeu() {
        affichage.afficherPlateau(plateau.getCases());
        while (!estTermine(pionJack) && !estTermine(pionBill) && pionJack.getVie() > 0 && pionBill.getVie() > 0) {
            jouerTour();
            affichage.afficherPlateauGraphique(plateau, pionJack, pionBill);
        }
        
        if (estTermine(pionJack) || pionBill.getVie() <= 0) {
            affichage.afficherFinDeJeu(pionJack);
        } else if (estTermine(pionBill) || pionJack.getVie() <= 0) {
            affichage.afficherFinDeJeu(pionBill);
        }
    }

    
}



    
