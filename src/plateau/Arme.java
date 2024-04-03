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
        pion.ajouterObjet(this.typeArme);
        return pion.getNom() + " récupère un " + typeArme.toString();
    }

    public Type getTypeArme() {
        return typeArme;
    }
}