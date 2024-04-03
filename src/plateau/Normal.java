package plateau;

import joueurs.Pions;

public class Normal extends Case {
    public Normal(int numero) {
        super(numero, Type.NORMAL);
    }

    @Override
    public String effet(Pions pion, Pions adversaire, Plateau plateau) {     
    	return "Case normale :)";
    }
}