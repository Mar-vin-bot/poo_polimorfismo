package prodPlan;

public abstract class Parte {
	private int cod;
	private String nome, descricao;
	private float valor;
	
	public Parte(int cod, String nome, String descricao, float valor) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public abstract float calcularValor();
	
	public abstract String  toString();

}
