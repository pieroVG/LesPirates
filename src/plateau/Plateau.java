package plateau;

import java.util.Random;


public class Plateau {
    private Case[] cases;
    private int nbCases;

    public Plateau(int nbCases) {
        cases = new Case[nbCases];
        this.nbCases = nbCases;
        initialiserPlateau();
    }

    private void initialiserPlateau() {
    	genererCases(Type.NORMAL);
    	genererCases(Type.DOUBLE_CANON);
    	genererCases(Type.SAKE);
    	genererCases(Type.KRAKEN);
        genererCases(Type.PERROQUET);
        genererCases(Type.POTION);
        
    }

    private void genererCases(Type type) {
        Random random = new Random();
        int position;
        int quantite = type.getQuantite();

        for (int i = 0; i < quantite; i++) {
            do {
                position = random.nextInt(nbCases); 
            } while (getCases()[position] != null);
            	getCases()[position] = creerCase(type, position);
        }
    }

    private Case creerCase(Type type, int numero) {
        switch (type) {
        	case SAKE:
        		return new Sake(numero);
        	case KRAKEN:
        		return new Kraken(numero);
            case DOUBLE_CANON:
                return new DoubleCanon(numero);
            case PERROQUET:
                return new Perroquet(numero);
            case POTION:
                return new Potion(numero);
            case NORMAL:
                return new Normal(numero);
      
        }
		return null;
    }
    
    
    public void afficherPlateau() {
        System.out.println("Plateau:");
        for (int i = 0; i < nbCases; i++) {
            if (getCases()[i] != null) {
                System.out.println("Case " + i + ": " + getCases()[i].getType());
            } else {
                System.out.println("Case " + i + ": Vide");
            }
        }
    }

	public Case[] getCases() {
		return cases;
	}
    

}
