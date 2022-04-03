package prodPlan;

public class Item {

	private Parte parte;
	private int quantidade;

	public Item(Parte parte, int quantidade) {
		super();
		this.parte = parte;
		this.quantidade = quantidade;
	}

	public Parte getParte() {
		return parte;
	}

	public void setParte(Parte parte) {
		this.parte = parte;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float calculaValor() {
		return parte.getValor() * quantidade;
	}

	public String toString() {
		return "cod " + parte.getCod() + " nome:" + parte.getNome() + " quantidade:" + getQuantidade() +
				" Valor unitario:"+parte.getValor() + " valor: "+calculaValor();
	}

}
