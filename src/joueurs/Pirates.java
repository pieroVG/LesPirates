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
		System.out.println(nom + " perd " + pv + " pv");
	}
	
	public void gagnerVie(int pv) {
		vie += pv;
		if (vie > 5) {
	        vie = 5;
	    }
	}
	
	public void ajouterObjet(Object objet) {
        inventaire.add(objet);
    }
}
