package produto.model;

public abstract class Produto {

	private String nome;
	private int tipo;
	private int codigo;
	private int quantidade;
	private float valor;

	public Produto(String nome, int tipo, int codigo, int quantidade, float valor) {
		this.nome = nome;
		this.tipo = tipo;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Camiseta";
			break;
		case 2:
			tipo = "Tênis";
			break;
		}
		System.out.println("\n-- Dados do produto");
		System.out.println("Nome: " + this.nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Código: " + this.codigo);
		System.out.println("Valor: R$ " + this.valor);
		System.out.println("Quantidade: " + this.quantidade);
	}
}