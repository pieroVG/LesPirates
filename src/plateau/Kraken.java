package plateau;

import joueurs.Pions;

public class Kraken extends Case {
    public Kraken(int numero) {
        super(numero, Type.KRAKEN);
    }

    @Override
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.perdreVie(4);
        return "Le kraken apparait !!!";
    }
}
