package jeu;

import java.util.Random;
import java.util.Scanner;

import affichage.Affichage;
import joueurs.Couleurs;
import joueurs.Pions;
import plateau.Plateau;

public class Jeu {
	private De de;
    private Plateau plateau;
    private Pions pionJack;
    private Pions pionBill;
    private Scanner scanner;
    private Affichage affichage; 
    
    public Jeu() {
    	de = new De();
        plateau = new Plateau();
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
    }

    private void jouerTour() {
        tourPion(pionJack);
        if (pionJack.getPosition() >= 30) {
            return;
        }
        
        tourPion(pionBill);
        if (pionBill.getPosition() >= 30) {          
            return;
        }

    }

    public void commencerJeu() {
    	plateau.afficherPlateau();
        while (pionJack.getPosition() <= 30 && pionBill.getPosition() <= 30 && pionJack.getVie() != 0 && pionBill.getVie() != 0) {
            jouerTour();
        }
        
        if (pionJack.getPosition() >= 30 || pionBill.getVie() == 0) {
            affichage.afficherMessage("Jack Le Borgne a gagné!"); 
        } else if (pionBill.getPosition() >= 30 || pionJack.getVie() == 0) {
            affichage.afficherMessage("Bill Jambe De Bois a gagné!");
        }
    }
}

    
