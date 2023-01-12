package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Colors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello!!");
		System.out.println("How many Shapes will there be?");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for (int i= 1; i < n; i ++) {
			System.out.println("For the shape #"+ i);
			System.out.println("Will it be a circle or a rectangle? (R/C)");
			char type = sc.next().charAt(0);
			System.out.println("What is the color? (BlACK, BLUE, RED)");
			Colors color = Colors.valueOf(sc.next());
			if (type == 'R') {
				System.out.println("What is the height of the rectangle?");
				double height = sc.nextDouble();
				System.out.println("What is the width of the rectangle?");
				double width = sc.nextDouble();
				list.add(new Rectangle(color, height, width));
			}else if (type == 'C') {
				System.out.println("What is the radius of the circle?");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}else
				System.out.println("The type is not valid!");
			int j= 0;
			System.out.println("\nShape Areas:");
			for (Shape shape : list) {
				System.out.println(shape.area());
				j++;
			}
			System.out.println("There is "+ j + "# Shapes!");
		}
		
		sc.close();
	}

}
