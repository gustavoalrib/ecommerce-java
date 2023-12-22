package produto.controller;

import java.util.ArrayList;
import produto.acoes.ProdutoAcoes;
import produto.model.Produto;

public class ProdutoController implements ProdutoAcoes {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;
	
	public void procurarPorCodigo(int numero) {
		
	}
	
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}
	
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto " + produto.getNome() + " foi cadastrado com sucesso!");
	}
	
	public void deletar(int numero) {
			
	}
	
	public void atualizar(Produto produto) {
		
	}
	
	public int gerarCodigo() {
		return ++ numero;
	}
	
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == numero) {
				return produto;
			}
		}
		
		return null;
	}
}
