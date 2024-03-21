package joueurs;

public class Pions extends Pirates{
	private Couleurs couleur;
	private int position = 1;
	private int modifierDe = 0;
	
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
		position += pos;
	}
	
	public int getModifierDe() {
        return modifierDe;
    }

    public void setModifierDe(int modifier) {
        modifierDe = modifier;
    }
	
}
