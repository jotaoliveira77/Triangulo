package sistemaDeNotas;

import java.util.Scanner;

public class Notas2 {

	double nota1, nota2, media;
	Scanner scan = new Scanner(System.in);
	
      double media() {
		media = (nota1 + nota2)/2;
		return media;
	}
      void resultadoMedia() {

    	  System.out.println("Insira a primeira nota:");
    	  nota1 = scan.nextDouble();
    	  
    	  System.out.println("Insira a segunda nota:");
    	  nota2 = scan.nextDouble();
    	  
    	  media();
    	  
    	  System.out.println("sua média é:" +media);
    	  
    	  if(media==10) {
    		  System.out.println("Aprovado com distinção");
    		  
    	  }
    	  else if (media >= 7) {
    		System.out.println("Aprovado");
    		
    	}
    	else{
    		System.out.println("Reprovado");
    		
    	}
    	  
    	  
      }
}
