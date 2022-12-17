package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		account account = new account(number,holder,initialDeposit);
		account accountWithoutDeposit = new account(number,holder);
		
		System.out.println("Enter account number: " );
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial value? (y/n)");
		char answer = sc.next().charAt(0);
		if(answer == 's') {
			
		}else if (answer == 'n') {
			
		}else
			System.out.println("Digite um valor valido!");
		
		
		sc.close();
	}

}
