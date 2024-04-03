package plateau;

import joueurs.Pions;

public abstract class Case {
	protected int numero;
	protected Type type;
	
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
	
	public abstract String effet(Pions pion, Pions adversaire, Plateau plateau); 

}
