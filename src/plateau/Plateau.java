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
        // Création cases normales du plateau
        for (int i = 1; i < nbCases; i++) {
            cases[i] = new Case(i, genererTypeCase());
        }
    
    }
    
    public Type genererTypeCase() {
        Random random = new Random();
        int totalPourcentage = 0;

        // Calculer la somme totale des pourcentages
        for (Type type : Type.values()) {
            totalPourcentage += type.getPourcentage();
        }

        // Générer un nombre aléatoire entre 0 et la somme totale des pourcentages
        int randomNumber = random.nextInt(totalPourcentage);

        // Parcourir les types de cases et choisir celui qui correspond au nombre aléatoire généré
        int cumulativePourcentage = 0;
        for (Type type : Type.values()) {
            cumulativePourcentage += type.getPourcentage();
            if (randomNumber < cumulativePourcentage) {
                return type;
            }
        }

        // En cas d'erreur ou d'imprécision, retourner le type par défaut (NORMAL)
        return Type.NORMAL;
    }

}
