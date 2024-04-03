package plateau;

import joueurs.Pions;

public class Perroquet extends Case {
    public Perroquet(int numero) {
        super(numero, Type.PERROQUET);
    }

    @Override
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        // Implémenter l'effet du perroquet sur le pion
    	return "Le perroquet change une case";
    }
}