package plateau;

import joueurs.Pions;

public class Perroquet extends Case {
    public Perroquet(int numero) {
        super(numero, Type.PERROQUET);
    }

    @Override
    public void effet(Pions pion) {
        // Implémenter l'effet du perroquet sur le pion
    }
}