package affichage;

import joueurs.Pions;
import plateau.Case;
import plateau.Plateau;

public class Affichage implements Iaffichage {
    @Override
    public void afficherResultatDes(int resultat) {
        System.out.println("Résultat des dés : " + resultat);
    }    
    
    @Override
    public void afficherTypeCase(Case caseActuelle) {
        if (caseActuelle != null) {
            System.out.println("Effet de la case : " + caseActuelle.getType());
        }
    }
    
    @Override
    public void afficherEffetCase(String message) {
        System.out.println(message);
    }

    @Override
    public void afficherPosition(Pions pion) {
        System.out.println("Position de " + pion.getNom() + " : " + (pion.getPosition() + 1));
    }
    
    @Override
    public void afficherChangementPV(Pions pion, int pvGagnesPerdus) {
        if (pvGagnesPerdus > 0) {
            System.out.println(pion.getNom() + " a gagné " + pvGagnesPerdus + " points de vie !");
        } else if (pvGagnesPerdus < 0) {
            System.out.println(pion.getNom() + " a perdu " + Math.abs(pvGagnesPerdus) + " points de vie !");
        } 
    }
    
    @Override
    public void afficherPV(Pions pion) {
    	System.out.println("PV de " + pion.getNom() + " : " + pion.getVie());
    }


    public void afficherPlateauGraphique(Plateau plateau, Pions pionJack, Pions pionBill) {
        int nbCases = plateau.getNbCases();
        System.out.println("Plateau:");
        for (int i = nbCases; i > 0; i--) {
            int caseNumber = i;
            if (pionJack.getPosition() + 1 == caseNumber && pionBill.getPosition() + 1 == caseNumber) {
                System.out.print("JB ");
            } else if (pionJack.getPosition() + 1 == caseNumber) {
                System.out.print("J  ");
            } else if (pionBill.getPosition() + 1 == caseNumber) {
                System.out.print("B  ");
            } else {
                System.out.print(caseNumber + "  ");
            }
            if (i % 5 == 0) {
                System.out.println(); // Nouvelle ligne pour chaque ligne de 5 cases
            }
        }
        System.out.println();
    }

    public void afficherFinDeJeu(Pions gagnant) {
        System.out.println("Le joueur " + gagnant.getNom() + " a gagné!");
    }


    public void afficherPlateau(Case[] cases) {
        System.out.println("Plateau:");
        for (int i = 1; i <= cases.length; i++) {
            if (cases[i - 1] != null) {
                System.out.println("Case " + i + ": " + cases[i - 1].getType());
            } else {
                System.out.println("Case " + i + ": Vide");
            }
        }
    }

	public void lancerDe() {
		System.out.println("Appuyez sur Entrée pour lancer les dés...");
		
	}

	public void afficherMessage(String string) {
		System.out.println(string);
		
	}
	
    public void afficherImmunite(Pions pion) {
        if (pion.aImmunite()) {
            System.out.println(pion.getNom() + " est immunisé contre les prochains dégâts !");
        }
    }
}