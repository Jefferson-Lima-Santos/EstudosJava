package Entities;

public final class SavingsAccount extends Account {
	private Double interestRate;
	public SavingsAccount() {
		
	}
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance += balance * interestRate;
	}
	/*O @Override serve também para indicar uma sobreposição de método, no caso, se existe dois métodos 
	 que dependendo do tipo na hora da instanciação um é acionado e o outro não, se um dos método no 
	 caso for de uma subclasse, utilizamos o @Override no método da subclasse para uma boa prática. 
	 além disso, isso avisa o compilador que aquele método é sobreposto
	
	 Ao utilizar o @Override no método da subclasse, o compilador busca na superclasse o 
	 método de mesmo nome, sendo assim, se não encontrado retorna um erro, já que nesse caso ou 
	 houve um erro de digitação no nome do método, ou não existe sobreposição.
	*/
	@Override
	public void withDraw( double amount) {
		balance -= amount;
	}
}
