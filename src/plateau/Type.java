package plateau;

public enum Type {
    SAKE(10),
    KRAKEN(3),
    PERROQUET(3),
    BOMBE(10),
    NORMAL(60);
	
	private int pourcentage;
	
	private Type(int pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	public int getPourcentage() {
		return pourcentage;
	}
}