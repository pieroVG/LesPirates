package plateau;

import java.util.Random;


public class Plateau {
    private Case[] cases;
    private int nbCases = Type.CASES.getQuantite();

    public Plateau(int nbCases) {
        cases = new Case[nbCases];
        this.nbCases = nbCases;
        initialiserPlateau();
    }

    private void initialiserPlateau() {
    	genererCases(Type.NORMAL);
    	genererCases(Type.SABRE);
    	genererCases(Type.REVOLVER);
    	genererCases(Type.DOUBLE_CANON);
    	genererCases(Type.STORM);
    	genererCases(Type.BARQUE);
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
            case SABRE:
                return new Arme(numero, Type.SABRE);
            case REVOLVER:
                return new Arme(numero, Type.REVOLVER);
            case STORM:
                return new Deplacement(numero, Type.STORM);
            case BARQUE:
                return new Deplacement(numero, Type.BARQUE);
            case NORMAL:
                return new Normal(numero);
		default:
			break;
      
        }
		return null;
    }

	public Case[] getCases() {
		return cases;
	}

	public int getNbCases() {
		return nbCases;
	}
    

}
