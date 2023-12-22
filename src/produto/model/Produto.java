package produto.model;

public abstract class Produto {

	private String nome;
	private int codigo;
	private int quantidade;
	private float valor;

	public Produto(String nome, int codigo, int quantidade, float valor) {
		this.nome = nome;
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
		System.out.println("-- Dados do produto");
		System.out.println("Nome: " + this.nome);
		System.out.println("Código: " + this.codigo);
		System.out.println("Valor: R$ " + this.valor);
		System.out.println("Quantidade: " + this.quantidade);
	}
}
