package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		//product.toString(); 
		//o .toString ja existe como função para tipos de objetos, porém eu o alterei para trazer informações diferentes.
		
		System.out.println(product);
		int answer;
		do {
			System.out.println("Sistema de Estoque Simples");
			System.out.println("1 - Aumentar estoque do item");
			System.out.println("2 - Diminuir estoque do item");
			System.out.println("0 - Para sair do sistema de estoque");
			answer = sc.nextInt();
			switch(answer) {
				case 1:
					System.out.println("Digite a quantidade a ser inserida");
					int valor = sc.nextInt();
					product.addProducts(valor);
					System.out.println(product);
					break;
				case 2:
					System.out.println("Digite a quantidade a ser removida");
					valor = sc.nextInt();
					if(valor > product.getQuantity())
						System.out.println("Não tem essa quantidade no estoque para ser removida");
					else
						product.removeProducts(valor);
					System.out.println(product);
					break;
			}
		}while (answer != 0);
		
		sc.close();
	}
}
