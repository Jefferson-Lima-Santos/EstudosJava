package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter Worker data:");
		System.out.print("Name: ");
		String workerName= sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		//Os dados do WorkerLevel pega instruções da classe WorkerLever assim como os dados do Department.
		
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contrcts for this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			System.out.println("Enter a contract #" + i +" data: ");
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration(hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income: (MM/YYYY)");
		String monthAndYear = sc.next();
		//O integer.parseInt esta transformando a String em inteiro.
		//O usuario vai entrar um dado como: 10/2022, a primeira substring vai pegar o dado do mês 10
		//A Segunda substring vai pegar o dado a partir do 3° carectere em diante no caso o 2022
		int month = Integer.parseInt(monthAndYear.substring(0 , 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		sc.close();
	}

}
