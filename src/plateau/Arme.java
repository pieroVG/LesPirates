package plateau;

import joueurs.Pions;

public class Arme extends Case {
    private Type typeArme;

    public Arme(int numero, Type typeArme) {
        super(numero, typeArme);
        this.typeArme = typeArme;
    }

    @Override
    public void effet(Pions pion, Pions adversaire, Plateau plateau) {
        pion.ajouterObjet(this);
    }

    public Type getTypeArme() {
        return typeArme;
    }
}