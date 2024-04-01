package plateau;

import joueurs.Pions;

public class Sake extends Case {
	 
    public Sake(int numero) {
        super(numero, Type.SAKE);
    }

    @Override
    public void effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.gagnerVie(1);
        pion.setModifierDe(-2); 
    }
}
