package jeu;

import java.util.Random;

import joueurs.Couleurs;
import joueurs.Pions;
import plateau.Plateau;

public class Jeu {
	private Plateau plateau;
    private Pions pionJack;
    private Pions pionBill;
	
	public Jeu() {
		plateau = new Plateau();
		pionJack = new Pions("Jack Le Borgne", Couleurs.ROUGE);
		pionBill = new Pions("Bill Jambe De Bois", Couleurs.BLEU);
	}
    
    
    
    
    
    public static int lancerDe() {
        Random random = new Random();
        return random.nextInt(6) + 1; 
    }
    
    private int resultatDes() {
    	return  lancerDe() + lancerDe();
    }
    
    
    
    
    
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
    }

}
