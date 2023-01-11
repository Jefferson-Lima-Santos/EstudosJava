package Entities;

public final class BusinessAccount extends Account{
	private Double loanLimit;
	public BusinessAccount() {
		
	}
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {// o valor de 10.0 é a taxa para empréstimo
		if (amount <= loanLimit + 10.0) {
			balance += amount - 10.0;
			
		}
	}
	/* Uma das utilizações do super(), na subclasse, é que pode ser utilizada para chamar um método da 
	 * superclasse de dentro da subclasse, sendo assim, uma forma de informar que está utilizando o método 
	 * da superclasse. 
	*/
	public void withDraw( double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}

}
