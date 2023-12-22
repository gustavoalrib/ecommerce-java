package produto.model;

public class ProdutoPromocao extends Produto {
	
	int desconto;

	public ProdutoPromocao(String nome, int codigo, float valor, int desconto) {
		super(nome, codigo, valor);
		this.desconto = desconto;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
}
