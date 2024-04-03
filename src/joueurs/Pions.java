package joueurs;


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
	
	public void deplacer(int pos) {
	    int newPosition = position + pos + modifierDe;
	    if (newPosition <= 29) {
	        position = newPosition;
	    } else {
	        position = 29 - (newPosition - 29); // Reculer
	    }
	    
	    if (tempsModifier > 0) {
	    	tempsModifier--;
	    	
	    	if (tempsModifier == 0) {
		    	modifierDe = 0;
		    	System.out.println(this.getNom() + " n'est plus bourré");
		    }
	    }
	    
	}
	
	public int getModifierDe() {
        return modifierDe;
    }

    public void setModifierDe(int modifier) {
        modifierDe = modifier;
        tempsModifier = 2;
    }
	
}
