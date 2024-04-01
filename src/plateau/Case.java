package plateau;

import joueurs.Pions;

public abstract class Case {
	private int numero;
	private Type type;
	
	protected Case(int numero, Type type) {
		this.numero = numero;
		this.type = type;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Type getType() {
		return type;
	}
	
	public abstract void effet(Pions pion, Pions adversaire, Plateau plateau); 

}
