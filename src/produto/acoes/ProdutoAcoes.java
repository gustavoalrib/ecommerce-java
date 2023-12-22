package produto.acoes;

import produto.model.Produto;

public interface ProdutoAcoes {

	public void procurarPorCodigo(int numero);
	public void cadastrar(Produto produto);
	public void listarTodos();
	public void atualizar(Produto produto);
	public void deletar(int numero);
}