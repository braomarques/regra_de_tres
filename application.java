package Regra_tres;

import java.util.Scanner;

public class application {
	Scanner sc = new Scanner(System.in);
	double v1,v2,v3;
	int opc;
	
	public void Menu() {
		System.out.println("***************************************");
		System.out.println("* Opção - 1 Diretamente proporcional  *");
		System.out.println("* Opção - 2 Inversamente proporcional *");
		System.out.println("* Opção - 3 Fechar Menu               *");
		System.out.println("***************************************"); 
	}
	public int escolherOpc() {
		opc=sc.nextInt();
		return opc;
	}
	
	public double DiretamenteP() {
		System.out.printf("Valor 1   Valor 2%n"
				+          "        =        %n"
				+          "Valor 3   Valor x%n"); // precisa necessariamente ser nessa ordem.
		System.out.println("Digite o Valor 1: ");
		v1 = sc.nextDouble();
		System.out.println("Digite o Valor 2: ");
		v2 = sc.nextDouble();
		System.out.println("Digite o Valor 3: ");
		v3 = sc.nextDouble();
		System.out.println("O resultado é: " + (v2*v3)/v1);
		return (v2*v3)/v1;
	}
	
	public double InversamenteP() {
		
		System.out.printf("Valor 1   Valor 2%n"
				+          "        =        %n"
				+          "Valor 3   Valor x%n");
		System.out.println("Digite o Valor 1: ");
		v1 = sc.nextDouble();
		System.out.println("Digite o Valor 2: ");
		v2 = sc.nextDouble();
		System.out.println("Digite o Valor 3: ");
		v3 = sc.nextDouble();
		System.out.println("O resultado é: " + (v1*v2) / v3);
		return (v1*v2) / v3;
	}
}
