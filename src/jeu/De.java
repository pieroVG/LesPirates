package jeu;

import java.util.Random;

public class De {
	
    private int lancerDe() {
        Random random = new Random();
        return random.nextInt(6) + 1; 
    }
    public int resultatDes() {
    	return  lancerDe() + lancerDe();
    }
}
