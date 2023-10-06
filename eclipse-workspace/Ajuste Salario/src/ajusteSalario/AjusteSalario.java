package ajusteSalario;

import java.util.Scanner;

public class AjusteSalario {
double salario, salario2, percentual;

Scanner scan = new Scanner(System.in);

double salarioAjuste() {
	if(salario<=280) {
		percentual = 0.2;
		salario2 = this.salario +(this.salario * percentual);
	}
	else if(salario > 280 && salario<700) {
		percentual = 0.15;
		salario2 = this.salario + (this.salario * percentual);
	}
	else if(salario >700 && salario<1500) {
		percentual = 0.10;
		salario2 = this.salario +(this.salario* percentual);
		
	}
	else {
		percentual = 0.5;
		salario2 = this.salario+(this.salario*percentual);
	}
	
	return salario;
}

void salarioAjuste2() {
	
	
		System.out.println("Digite o valor do salario");
		salario = scan.nextDouble();
		
		salarioAjuste();
		
		System.out.println("Salario antes do reajuste: " + salario);
		System.out.println("percentual do aumento: " + (percentual * 100) +"%");
		System.out.println("valor do aumento: " + (salario2 - salario));
        System.out.println("O novo salário pós aumento: " + salario2);
}


}
