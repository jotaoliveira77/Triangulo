package maiorNumero;

import java.util.Scanner;

public class MaiorNumero2 {
Scanner scan = new Scanner(System.in);
	int n1, n2, n3, nmaior;
	
	double maiorNum() {
		 if (n1 > n2){
	            if (n1 > n3){ 
	                nmaior = n1;
	            } else{ 
	                nmaior = n3;
	            }
	        } else if (n2 > n3){ 
	            nmaior = n2;
	        } else {
	            nmaior = n3;
	        }		
		return nmaior;
	}
	
	void resultado() {
		
		
		System.out.println("Defina um valor para o primeiro numero:");
		this.n1 = scan.nextInt();
		
		System.out.println("Defina um valor para o segundo numero:");
		this.n2 = scan.nextInt();
		
		System.out.println("Defina um valor para o terceiro numero:");
		this.n3 = scan.nextInt();
		
        maiorNum();
        System.out.println("o maior numero é:"+ nmaior);
		
		
	}
}
