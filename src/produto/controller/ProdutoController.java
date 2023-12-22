package produto.controller;

import java.util.ArrayList;
import produto.acoes.ProdutoAcoes;
import produto.model.Produto;

public class ProdutoController implements ProdutoAcoes {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int codigo = 0;

	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto " + produto.getNome() + " foi cadastrado com sucesso!");
	}

	public void deletar(int codigo) {
		var produto = buscarNaCollection(codigo);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto de código: " + codigo + " foi deletado com sucesso!");
		} else
			System.out.println("\nAO produto de código: " + codigo + " não foi encontrado!");

	}

	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getCodigo());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto: " + produto.getNome() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto: " + produto.getNome() + " não foi encontrado!");
	}

	public int gerarCodigo() {
		return ++ codigo;
	}

	public Produto buscarNaCollection(int codigo) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}

		return null;
	}
}
