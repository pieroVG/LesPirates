package plateau;

import joueurs.Pions;

public class DoubleCanon extends Case {

    public DoubleCanon(int numero) {
        super(numero, Type.DOUBLE_CANON);
    }

    public void Boom(Pions pion, Pions adversaire) {
        
        pion.deplacer(1);
        adversaire.deplacer(-2);
     
        adversaire.perdreVie(1);
    }

	@Override
	public void effet(Pions pion) {
	}
}