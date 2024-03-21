package plateau;

public enum Type {
    SAKE(6),
    KRAKEN(1),
    POTION(1),
    PERROQUET(2),
    DOUBLE_CANON(8),
    NORMAL(12);
	
	private int quantite;
	
	private Type(int quantite) {
		this.quantite = quantite;
	}
	
	public int getQuantite() {
		return quantite;
	}
}