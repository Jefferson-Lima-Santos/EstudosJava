package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please, pass me your data");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY)");
		Date birthDate = sdf.parse(sc.next());
		
		Client c = new Client(name, email, birthDate);
		
		System.out.println("Enter your order data: ");
		System.out.println("Status: ");
		
		
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, c);
		
		System.out.println("How many items to this order? ");
		int orderQntt = sc.nextInt();
		for(int i = 0; i < orderQntt; i++) {
			System.out.println("Product Name: ");
			String productName = sc.next();
			System.out.println("Enter the product price:");
			double price = sc.nextDouble();
			System.out.println("Quantity: ");
			int productQntt = sc.nextInt();
			
			Product p = new Product(productName, price);
			OrderItem orderItem = new OrderItem(productQntt, price, p);
			order.addItem(orderItem);
			
		}
		System.out.println("\n \n");
		System.out.println(order);
		
		
		sc.close();
		
	}

}
