package joueurs;

public class Pirates {
	private String nom;
	private int vie = 5;
	
	public Pirates(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getVie() {
		return vie;
	}
	
	public void setVie(int pv) {
		vie = pv;
	}
	
	public boolean estEnVie() {
        return vie > 0;
    }
}
