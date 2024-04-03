package joueurs;
import java.util.ArrayList;
import java.util.List;

import plateau.Type;

public class Pirates {
	private String nom;
	private int vie = 5;
	private List<Object> inventaire = new ArrayList<>();
	private boolean immunite = false;
	
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
		if (!immunite) {
			vie -= pv;
		}
		else {
			immunite = false;
		}
	}
	
	public void gagnerVie(int pv) {
		vie += pv;
		if (vie > 5) {
	        vie = 5;
	    }
	}
	
	public String ajouterObjet(Type objet) {
	    if (inventaire.contains(objet)) {
	        return objet.toString() + " est déjà présent dans l'inventaire.";
	    } else {
	        inventaire.add(objet);
	        return nom + " récupère un " + objet.toString();
	    }
	}
	
    public boolean aImmunite() {
        return immunite;
    }

    public void activerImmunite() {
        immunite = true;
    }
}
