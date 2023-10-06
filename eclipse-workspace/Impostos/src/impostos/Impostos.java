package impostos;

import java.util.Scanner;

public class Impostos {
	double salariobr, IR, sind, liq, horasvalor, qthoras, inss, fgts, desconto;
	
	Scanner scan = new Scanner(System.in);
	
	double descontoIR(){
		
		inss = salariobr *0.10;
		fgts = salariobr *0.11;
		
		if(salariobr <=900) {
            IR = 0; 
            desconto = inss;
			liq = salariobr - desconto;
		}
		else if(salariobr <=1500) {
			IR = 0.05;
			desconto = salariobr * IR +inss;
			liq = salariobr - desconto;
		}
		else if(salariobr <=2500) {
			IR = 0.10;
			desconto = salariobr * IR +inss;
			liq = salariobr - desconto;
		}
		else {
			IR = 0.2;
			desconto = salariobr * IR +inss;
			liq = salariobr - desconto;
		}
		
		return liq;
	}
	 void tabela() {
		 System.out.println("quantas horas foram trabalhadas?");
		 qthoras = scan.nextDouble();
		 
		 System.out.println("qual o valor da hora?");
		 horasvalor = scan.nextDouble();
		 
		 salariobr = qthoras * horasvalor;
		 
		 descontoIR();
		 
		 System.out.println("Salário bruto: R$ " + salariobr);		 
		 System.out.println("(-) IR ("+ (IR * 100) +"%): R$ " + salariobr * IR);
		 System.out.println("(-) INSS (10%): R$ "+ (inss));
		 System.out.println("FGTS (11%): R$ " +(fgts));
		 System.out.println("Total de descontos: R$ " + desconto);
		 System.out.println("Salário líquido: R$ "+ liq);
	 }
}
