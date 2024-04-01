package plateau;

import joueurs.Pions;

public class DoubleCanon extends Case {

    public DoubleCanon(int numero) {
        super(numero, Type.DOUBLE_CANON);
    }

	@Override
	public void effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.deplacer(1);
        adversaire.deplacer(-2);
     
        adversaire.perdreVie(1);
	}
}