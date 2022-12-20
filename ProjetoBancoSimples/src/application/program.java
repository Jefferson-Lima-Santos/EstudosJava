package application;
import java.util.Scanner;
import entities.account;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		account newAccount = null;// Ao instanciar o objeto dentro do if as funções do objeto ficam limitadas a serem utilizadas
		//dentro do if
		//ao instanciar o objeto antes, fora do if, podemos instanciar suas funções em qualquer parte do código, 
		//sendo após a instanciação do objeto.
		
		
		System.out.println("Enter account number: " );
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial value? (y/n)");
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			System.out.println("Enter the initial value for deposit");
			double value = sc.nextDouble();
			newAccount = new account(number,holder,value);
			
		}else if (answer == 'n') {
			newAccount = new account(number,holder);
			
		}else
			System.out.println("Digite um valor valido!");
		
		System.out.println("Account Data: ");
		System.out.println(newAccount);
		
		System.out.println("Enter a deposit Value");
		double depositValue = sc.nextDouble();
		newAccount.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(newAccount);
		
		System.out.println("Enter a withdraw Value");
		double withdraw = sc.nextDouble();
		newAccount.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(newAccount);
		sc.close();
	}

}
