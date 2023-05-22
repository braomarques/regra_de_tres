package Regra_tres;

public class Main {

	public static void main(String[] args) {
		application a=new application();
		do {
			a.Menu();
			a.escolherOpc();
			if(a.opc==1) {
				a.DiretamenteP();
			}
			if(a.opc==2) {
				a.InversamenteP();
			}
		}while(a.opc!=3);
		System.out.println("SISTEMA ENCERRADO!");
	}
	}


