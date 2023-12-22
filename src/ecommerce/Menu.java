package ecommerce;

import java.util.Scanner;
import produto.controller.ProdutoController;
import produto.model.Tenis;
import produto.model.Camiseta;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner ler = new Scanner(System.in);

		String nome, cor;
		int opcao, tipo, codigo, quantidade, tamanho;
		float valor;

		while (true) {

			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("\tE-commerce Generation                  ");
			System.out.println("                                         ");
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("	1 - Adicionar produto.               ");
			System.out.println("	2 - Listar todos os produtos.        ");
			System.out.println("	3 - Atualizar dados do produto.      ");
			System.out.println("	4 - Apagar produto                   ");
			System.out.println("	5 - Sair.                            ");
			System.out.println("                                         ");
			System.out.println("\nEntre com a opção desejada:            ");

			opcao = ler.nextInt();

			if (opcao == 5) {
				System.out.println("Você saiu de E-commerce Generation. Obrigade pela visita!");
				sobre();
				ler.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("-- Adicionar novo produto");
				System.out.println("Digite o nome do produto: ");
				ler.skip("\\R?");
				nome = ler.nextLine();
				System.out.println("Digite o valor do produto R$: ");
				valor = ler.nextFloat();
				System.out.println("Digite a quantidade do produto: ");
				quantidade = ler.nextInt();

				do {
					System.out.println("Digite o tipo de produto (1-Camiseta ou 2-Tênis): ");
					tipo = ler.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite a cor da camiseta: ");
					ler.skip("\\R?");
					cor = ler.nextLine();
					produtos.cadastrar(new Camiseta(nome, produtos.gerarCodigo(), quantidade, valor, cor));
				}
				case 2 -> {
					System.out.println("Digite o tamanho do tênis: ");
					tamanho = ler.nextInt();
					produtos.cadastrar(new Tenis(nome, produtos.gerarCodigo(), quantidade, valor, tamanho));
				}
				}

				break;
			case 2:
				System.out.println("-- Listar todos os produtos");
				produtos.listarTodos();
				break;
			case 3:
				System.out.println("-- Atualizar dados do produto");
				System.out.println("Digite o código do produto: ");
				codigo = ler.nextInt();

				var buscaProduto = produtos.buscarNaCollection(codigo);

				if (buscaProduto != null) {
					System.out.println("Digite o nome do produto: ");
					ler.skip("\\R?");
					nome = ler.nextLine();
					System.out.println("Digite o valor do produto R$: ");
					valor = ler.nextFloat();
					System.out.println("Digite a quantidade do produto: ");
					quantidade = ler.nextInt();
				}
				break;
			case 4:
				System.out.println("Deletar um produto.");
				System.out.println("Digite o código do produto: ");
				codigo = ler.nextInt();
				produtos.deletar(codigo);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n***********************************************");
		System.out.println("Projeto Desenvolvido por:");
		System.out.println("Gustavo Almeida - gustavoalrib@gmail.com");
		System.out.println("github.com/gustavoalrib");
		System.out.println("***********************************************");
	}
}
