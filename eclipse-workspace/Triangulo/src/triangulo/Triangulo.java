package triangulo;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Triangulo {

	Scanner scan = new Scanner(System.in);
	
	int ladoA, ladoB, ladoC, soma, equilatero, escaleno, isosceles, erro;
	
	int tri() {
		erro = 0;
		equilatero = 1;
		isosceles =2;
		escaleno = 3;
		
		if(ladoA+ ladoB <ladoC ) {
			
			soma = erro;
			
		}
		else if(ladoB + ladoC< ladoA) {
			soma= erro;
		}
		
		else if(ladoA == ladoB && ladoB == ladoC) {
			
			soma = equilatero;
			
		}
		else if (ladoA==ladoB) {
			if(ladoA!=ladoC) {
				
				soma = isosceles;
			}
		}else if(ladoA==ladoC) { 
			if(ladoB!=ladoC) {
				
				soma = isosceles;
			}
		}else if(ladoB==ladoC) { 
			if(ladoA!=ladoC) {
				
				soma = isosceles;
			}
		}else if(ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
			
			soma=escaleno;
		}
		
		
	 	return soma;
	}
	
	void tri2() {
		System.out.println("Insira o valor do primeiro lado ");
		ladoA = scan.nextInt();
		
		System.out.println("Insira o valor do segundo lado");
		ladoB = scan.nextInt();

		System.out.println("Insira o valor do terceiro lado");
		ladoC = scan.nextInt();
		tri();
		
		switch(soma) {
		case 1:
			System.out.println("equilatero");
			break;
		case 2:
			System.out.println("isosceles");
			break;
		case 3:
			System.out.println("escaleno");
			break;
		case 0:
			System.out.println("esses valores não coincidem com os de um triangulo");
		
		}
		
		
	
		}
	}

