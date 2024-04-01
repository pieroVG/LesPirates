package plateau;

import joueurs.Pions;

public class Kraken extends Case {
    public Kraken(int numero) {
        super(numero, Type.KRAKEN);
    }

    @Override
    public void effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.perdreVie(4);
    }
}
