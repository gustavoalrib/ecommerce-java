package produto.model;

public class Tenis extends Produto {

	int tamanho;

	public Tenis(String nome, int codigo, int quantidade, float valor, int tamanho) {
		super(nome, codigo, quantidade, valor);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}