package plateau;

public class Plateau {
    private Case[] cases;
    private int nbCases = 31;

    public Plateau() {
        cases = new Case[nbCases];
        initialiserPlateau();
    }

    private void initialiserPlateau() {
        // Création cases normales du plateau
        for (int i = 1; i < nbCases-1; i++) {
            cases[i] = new Case(i, Type.NORMAL);
        }
    
    }

}
