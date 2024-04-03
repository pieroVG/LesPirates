package plateau;

import joueurs.Pions;

public class Arme extends Case {
    private Type typeArme;

    public Arme(int numero, Type typeArme) {
        super(numero, typeArme);
        this.typeArme = typeArme;
    }

    @Override
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        return pion.ajouterObjet(this.typeArme);
    }

    public Type getTypeArme() {
        return typeArme;
    }
}