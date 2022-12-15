package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		double xA, xB, xC, yA, yB, yC;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com as medidas do Triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do Triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.println("Essa é a area do Triangulo X: " + areaX);
		
		System.out.println("Essa é a area do Triangulo X: " + areaY);
		
		
		if(areaX > areaY) 
			System.out.println("O Triangulo de maior area é o Triangulo X");
		else if(areaX == areaY)
			System.out.println("A area dos Triangulos são iguais");
		else
			System.out.println("O Triangulo de maior area é o Triangulo Y");
		
		
		System.out.println("Iremos repetir o processo, mas utilizando as variaveis de outra classe. . . ");
	    Triangulo x,y;
	    
	    x = new Triangulo();
	    y = new Triangulo();

	    System.out.println("Entre com as medidas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (x.a + x.b + x.c) / 2.0;
		
		areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		
		p = (y.a + y.b + y.c) / 2.0;
		areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.println("Essa é a area do Triangulo X: " + areaX);
		
		System.out.println("Essa é a area do Triangulo X: " + areaY);
		if(areaX > areaY) 
			System.out.println("O Triangulo de maior area é o Triangulo X");
		else if(areaX == areaY)
			System.out.println("A area dos Triangulos são iguais");
		else
			System.out.println("O Triangulo de maior area é o Triangulo Y");
		
		
		System.out.println("Iremos repetir o processo, mas utilizando as variaveis e a funcao de outra classe. . . ");
	    
	    x = new Triangulo();
	    y = new Triangulo();
	    
	    System.out.println("Entre com as medidas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		if(areaX > areaY) 
			System.out.println("O Triangulo de maior area é o Triangulo X");
		else if(areaX == areaY)
			System.out.println("A area dos Triangulos são iguais");
		else
			System.out.println("O Triangulo de maior area é o Triangulo Y");
	    
	    
		sc.close();
	}
}
