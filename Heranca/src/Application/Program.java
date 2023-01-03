package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Jefferson", 0.0);
		BusinessAccount bacc= new BusinessAccount(1002, "Jefferson", 0.0, 500.0);
		
		
		//UPCASTING
		//Nao existe erro, pois, existe apenas a atribuição de uma subclasse para a superclasse
		Account acc1 = bacc;
		acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "Jefferson", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Jefferson", 0.0,0.01);
		//DOWNCASTING
		//Converter da super para a sub, o inverso do oque foi feito anteriormente
		//A ide reclama que não é possível fazer a conversão da super para a sub, mas, se o fizer manualmente
		//Acionando o (BusinessAccount) logo atras da variavel, a IDE remove o erro, no caso um casting manual
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
	}
}
