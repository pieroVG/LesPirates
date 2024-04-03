package plateau;

import joueurs.Pions;

public class Deplacement extends Case {
    private Type typeDeplacement;

    public Deplacement(int numero, Type typeDeplacement) {
        super(numero, typeDeplacement);
        this.typeDeplacement = typeDeplacement;
    }

    @Override
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {
        String message = "";
        switch (typeDeplacement) {
            case STORM:
                pion.deplacer(-pion.getPosition());
                message = "Tempête! Retour au début du plateau.";
                break;
            case BARQUE:
                pion.deplacer(5);
                message = "Vous avez trouvé une barque! Avancez de 5 cases.";
                break;
            default:
                break;
        }
        return message;
    }

    public Type getTypeDeplacement() {
        return typeDeplacement;
    }
}