package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many products will be registered? ");
		int n = sc.nextInt();
		product[] vect = new product[n];
		for(int i=0;i<vect.length;i++) {
// o vect.length permite fazer uma estrutura de repetição que só para quando ler todos os dados do vetor nesse exemplo, independe de uma variavel que não esteja diretamente relacionado com o vetor
			sc.nextLine();
			System.out.println("Name of product n°"+(i+1)+" : ");
			String name = sc.nextLine();;
			System.out.println("Price of product n°"+(i+1)+" : ");
			double price = sc.nextDouble();
			vect[i] = new product(name,price);
		}
		double sum = 0.0;
		for(int i=0;i<vect.length;i++)
			sum += vect[i].getPrice();
		
		double avg = sum/n;
		System.out.printf("Avarage price = %.2f%n", avg);
		
		sc.close();
	}

}
