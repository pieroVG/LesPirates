package affichage;

import joueurs.Pions;
import plateau.Case;

public interface Iaffichage {
    void afficherResultatDes(int resultat);

    void afficherTypeCase(Case caseActuelle);

    void afficherPosition(Pions pion);
    
    void afficherEffetCase(String message);
    
    void afficherChangementPV(Pions pion, int pvGagnesPerdus);

	void afficherPV(Pions pion);
}