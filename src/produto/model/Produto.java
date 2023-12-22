package produto.model;

public abstract class Produto {
	
	String nome;
	int codigo;
	float valor;
	
	public Produto(String nome, int codigo, float valor) {
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
