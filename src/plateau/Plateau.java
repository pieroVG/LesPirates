package plateau;

import java.util.Random;

public class Plateau {
    private Case[] cases;
    private int nbCases = 31;

    public Plateau() {
        cases = new Case[nbCases];
        initialiserPlateau();
    }

    private void initialiserPlateau() {
        Random random = new Random();
        for (int i = 1; i < nbCases; i++) {
            Type type = choisirType(random);
            Case nouvelleCase;
            switch (type) {
                case SAKE:
                    nouvelleCase = new Sake(i);
                    break;
                case KRAKEN:
                    nouvelleCase = new Kraken(i);
                    break;
                case POTION:
                    nouvelleCase = new Potion(i);
                    break;
                case PERROQUET:
                    nouvelleCase = new Perroquet(i);
                    break;
                case DOUBLE_CANON:
                    nouvelleCase = new DoubleCanon(i);
                    break;
                case NORMAL:
                    nouvelleCase = new Normal(i);
                    break;
                default:
                    throw new IllegalArgumentException("Type de case inconnu : " + type);
            }
            cases[i] = nouvelleCase;
        }
    }

    private Type choisirType(Random random) {
        int total = 0;
        for (Type type : Type.values()) {
            total += type.getQuantite();
        }
        int choix = random.nextInt(total) + 1;
        int sommePartielle = 0;
        for (Type type : Type.values()) {
            sommePartielle += type.getQuantite();
            if (choix <= sommePartielle) {
                return type;
            }
        }
        throw new IllegalStateException("Aucun type de case n'a été choisi.");
    }
    

}
