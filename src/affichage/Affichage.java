package affichage;

import joueurs.Pions;
import plateau.Case;
import plateau.Plateau;

public class Affichage {
    public void afficherPosition(Pions pion) {
        System.out.println("Position de " + pion.getNom() + " : " + (pion.getPosition()+1) );
    }

    public void afficherResultatDes(int resultat) {
        System.out.println("Résultat des dés : " + resultat);
    }

    public void afficherFinDeJeu(Pions gagnant) {
        System.out.println("\nLe joueur " + gagnant.getNom() + " a gagné!");
    }

	public static void afficherMessage(String message) {
		 System.out.println(message);
		
	}
	
	public static void afficherPlateau(Case[] cases) {
	    System.out.println("Plateau:");
	    for (int i = 1; i <= cases.length; i++) {
	        if (cases[i - 1] != null) {
	            System.out.println("Case " + i + ": " + cases[i - 1].getType());
	        } else {
	            System.out.println("Case " + i + ": Vide");
	        }
	    }
	}
	
	public static void afficherPlateauGraphique(Plateau plateau, Pions pionJack, Pions pionBill) {
	    int nbCases = plateau.getNbCases();
	    System.out.println("Plateau:");
	    for (int i = nbCases; i > 0; i--) {
	        int caseNumber = i;
	        if (pionJack.getPosition()+1 == caseNumber && pionBill.getPosition()+1 == caseNumber) {
	            System.out.print("JB ");
	        } else if (pionJack.getPosition()+1 == caseNumber) {
	            System.out.print("J  ");
	        } else if (pionBill.getPosition()+1 == caseNumber) {
	            System.out.print("B  ");
	        } else {
	            System.out.print(caseNumber + "  "); 
	        }
	        if (i % 5 == 0) {
	            System.out.println(); // Nouvelle ligne pour chaque ligne de 5 cases
	        }
	    }
	}

	
	
}
