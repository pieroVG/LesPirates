package joueurs;

import plateau.Type;

public class Pions extends Pirates{
	private Couleurs couleur;
	private int position = 0;
	private int modifierDe = 0;
	private int tempsModifier = 0;
	
	public Pions(String nom, Couleurs couleur) {
		super(nom);
		this.couleur = couleur;
	}
	
	public Couleurs getCouleur() {
		return couleur;
	}
	
	public int getPosition() {
		return position;
	}
	
	public String deplacer(int pos) {
		int nbCases = Type.CASES.getQuantite()-1;
	    int newPosition = position + pos + modifierDe;
	    if (newPosition <= nbCases) {
	        position = newPosition;
	    } else {
	        position = nbCases - (newPosition - nbCases); // Reculer
	    }
	    
	    if (tempsModifier > 0) {
	    	tempsModifier--;
	    	
	    	if (tempsModifier == 0) {
		    	modifierDe = 0;
		    	return this.getNom() + " n'est plus bourré ";
		    }
	    }
		return null;  
	}
	
	public int getModifierDe() {
        return modifierDe;
    }

    public void setModifierDe(int modifier) {
        modifierDe = modifier;
        tempsModifier = 2;
    }
	
}
