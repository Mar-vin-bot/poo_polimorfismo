package prodPlan;

public class Motor extends Parte {

	private float potencia, corrente;
	private int rpm;

	public Motor(int cod, String nome, String descricao, float valor, float potencia, float corrente, int rpm) {
		super(cod, nome, descricao, valor);
		this.potencia = potencia;
		this.corrente = corrente;
		this.rpm = rpm;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCorrente() {
		return corrente;
	}

	public void setCorrente(float corrente) {
		this.corrente = corrente;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	@Override
	public float calcularValor() {
		// TODO Auto-generated method stub
		return getValor();
	}

	@Override
	public String toString() {
		return " codigo:" + getCod() + " nome:" + getNome() + " descricao:" + getDescricao() + 
				" Potencia:"+getPotencia() +" Corrente"+getCorrente()+" RPM"+getRpm();
	}

}
