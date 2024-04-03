package plateau;

import joueurs.Pions;

public class Sake extends Case {
	 
    public Sake(int numero) {
        super(numero, Type.SAKE);
    }

    @Override
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.gagnerVie(1);
        pion.setModifierDe(-2);
        return pion.getNom() + " est bourré, il avancera moins vite";
    }
}
