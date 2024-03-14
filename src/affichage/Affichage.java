package affichage;

import joueurs.Pions;

public class Affichage {
    public void afficherPositionPion(Pions pion) {
        System.out.println("Position de " + pion.getNom() + " : " + pion.getPosition());
    }

    public void afficherResultatDes(int resultat) {
        System.out.println("Résultat des dés : " + resultat);
    }

    public void afficherFinDeJeu(String gagnant) {
        System.out.println("Le joueur " + gagnant + " a gagné!");
    }

	public void afficherMessage(String message) {
		 System.out.println(message);
		
	}
}