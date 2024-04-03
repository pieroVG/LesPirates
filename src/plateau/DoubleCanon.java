package plateau;

import joueurs.Pions;

public class DoubleCanon extends Case {

    public DoubleCanon(int numero) {
        super(numero, Type.DOUBLE_CANON);
    }

	@Override
	public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.deplacer(1);
        adversaire.deplacer(-2);
     
        adversaire.perdreVie(1);
        
        return pion.getNom() + " avance d'une case tandis que " + adversaire.getNom() + " recule de 2 cases";
	}
}