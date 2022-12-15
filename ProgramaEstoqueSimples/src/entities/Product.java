package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	
	//Construtor feito em Java
	public Product(String name,double price, int quantity) {
//se eu colocar apenas name = name por exemplo, o programa entende que a variavel que estou chamando é a do parametro do metodo e não a local
//para que isso não acontessa utilizamos o this
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//é possível o uso de sobrecarga, como por exemplo, usando o mesmo construtor mas com métodos diferentes.
	//é possível então chamar o mesmo construtor, mas passando parametros diferentes.
	public Product(String name,double price) {
				this.name = name;
				this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
		public int getQuantity() {
		return quantity;
	}
	public String getName() {
		return name;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;  
	// o this serve para referenciar um atributo da própria classe, nesse caso usado, pois a função tem o mesmo nome em sua atribuição
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + " - $ " + price + " - " + quantity + " - $" + String.format("%.2f",totalValueInStock());
	}
}
