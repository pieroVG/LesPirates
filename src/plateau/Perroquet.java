package plateau;

import joueurs.Pions;

public class Perroquet extends Case {
    public Perroquet(int numero) {
        super(numero, Type.PERROQUET);
    }

    @Override
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        Case[] cases = plateau.getCases();

        for (int i = pion.getPosition() + 1; i < cases.length; i++) {
            if (cases[i] != null && cases[i].getType() == Type.NORMAL) {
                cases[i] = new Potion(i);
                return "La case " + (i + 1) + " a été transformée en Potion par le Perroquet.";
            }
        }

        return "Aucune case normale disponible pour être transformée en Potion par le Perroquet.";
    }
}