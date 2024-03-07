package joueurs;

public class Pions extends Pirates{
	private Couleurs couleur;
	private int position = 1;
	
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
		position = pos;
	}
	
}
