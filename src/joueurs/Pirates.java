package joueurs;
import java.util.ArrayList;
import java.util.List;

public class Pirates {
	private String nom;
	private int vie = 5;
	 private List<Object> inventaire = new ArrayList<>();
	
	public Pirates(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getVie() {
		return vie;
	}
	
	public void perdreVie(int pv) {
		vie -= pv;
	}
	
	public void gagnerVie(int pv) {
		vie += pv;
	}
	
	public boolean estEnVie() {
        return vie > 0;
    }
	
	public void ajouterObjet(Object objet) {
        inventaire.add(objet);
    }
}
