package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		byte n = ler.nextByte();
		for (int i=1;i<=n;i++) {
			System.out.println("Employee #" + i +" data:");
			System.out.print("Outsourced? (y/n)");
			char ch = ler.next().charAt(0);
			System.out.print("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Hours: ");
			int hours = ler.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = ler.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = ler.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.paymant()));
		}
		
		
		
		
		
		
		
		
		
		ler.close();

	}

}
