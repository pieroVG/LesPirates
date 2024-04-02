package plateau;

import affichage.Affichage;
import joueurs.Pions;

public class Deplacement extends Case {
    private Type typeDeplacement;

    public Deplacement(int numero, Type typeDeplacement) {
        super(numero, typeDeplacement);
        this.typeDeplacement = typeDeplacement;
    }

    @Override
    public void effet(Pions pion, Pions adversaire, Plateau plateau) {
        switch (typeDeplacement) {
            case STORM:
                pion.deplacer(-pion.getPosition());
                Affichage.afficherMessage("Tempête! Retour au début du plateau.");
                break;
            case BARQUE:
                pion.deplacer(5);
                Affichage.afficherMessage("Vous avez trouvé une barque! Avancez de 5 cases.");
                break;
            default:
                break;
        }
    }

    public Type getTypeDeplacement() {
        return typeDeplacement;
    }
}