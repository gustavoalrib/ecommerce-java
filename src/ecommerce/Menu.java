package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int opcao;

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
		}

		switch (opcao) {
		case 1:
			System.out.println("Adicionar novo produto.");
			break;
		case 2:
			System.out.println("Listar todos os produtos.");
			break;
		case 3:
			System.out.println("Atualizar dados de um produto.");
			break;
		case 4:
			System.out.println("Deletar um produto.");
			break;
		default:
			break;
		}
	}
}
