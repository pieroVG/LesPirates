package plateau;

import joueurs.Pions;

public class Potion extends Case {
    public Potion(int numero) {
        super(numero, Type.POTION);
    }

    @Override
    public void effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.ajouterObjet(this);
    }
}