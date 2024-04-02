package plateau;

public enum Type {
    SAKE(5),
    KRAKEN(1),
    POTION(1),
    PERROQUET(1),
    SABRE(1),
    REVOLVER(1),
    DOUBLE_CANON(5),
    STORM(1),
    BARQUE(2),
    NORMAL(12);
	
	
	
	private int quantite;
	
	private Type(int quantite) {
		this.quantite = quantite;
	}
	
	public int getQuantite() {
		return quantite;
	}
}