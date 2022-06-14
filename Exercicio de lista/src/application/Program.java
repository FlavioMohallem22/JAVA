package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Digite quantos funcionarios você deseja adicionar: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			float salary = sc.nextFloat();
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Entre com o id do funcionario o qual deseja aumentar o salario: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse funcionario nao existe");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			float percentage = sc.nextFloat();
			emp.aumento(percentage);
		}
		
		System.out.println();
		System.out.println("lista de funcionario:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
