package joueurs;
import java.util.ArrayList;
import java.util.List;

import affichage.Affichage;

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
	
	public void ajouterObjet(Object objet) {
        inventaire.add(objet);
    }
	
    public boolean aImmunite() {
        return immunite;
    }

    public void activerImmunite() {
        immunite = true;
    }
}
