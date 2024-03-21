package plateau;

import joueurs.Pions;

public class Sake extends Case {
	private int toursRestants;
	 
    public Sake(int numero) {
        super(numero, Type.SAKE);
        toursRestants = 2;
    }

    @Override
    public void effet(Pions pion) {
        pion.gagnerVie(1);
        if (toursRestants > 0) {
            pion.setModifierDe(-2); 
            toursRestants--;
        }
    }
}
