package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();

		Produto produto = new Produto(nome, preco);

		produto.setNome("Computador");
		System.out.println("Produto atualizado " + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("Produto atualizado " + produto.getPreco());

		System.out.println();
		System.out.println("Produto: " + produto);
		System.out.println();
		System.out.print("Entre com o numero de produtos para serem adicionados no estoque: ");

		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);

		System.out.println();
		System.out.print("Entre com o numero de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.tiraProduto(quantidade);

		sc.close();
	}

}
