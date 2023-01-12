package mesadejogo;

public class Peca {
	protected Posicao posicao;
	private Mesa mesa;
	public Peca(Mesa mesa) {
		this.mesa = mesa;
		posicao = null;
	}
	
	public Mesa getMesa() {
		return mesa;
	}

}
