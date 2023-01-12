package application;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
		}
			System.out.println("End of program");
			sc.close();
	}
}
