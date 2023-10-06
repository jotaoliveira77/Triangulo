package Banco;

import java.util.Scanner;

public class Banco {
double saldo, quantia;
Scanner scan = new Scanner(System.in);

public void deposito(){
	
	System.out.println("selecione um valor para o deposito");
	quantia = scan.nextDouble();
	saldo = quantia + saldo;
	
}


public void saque() {
	System.out.println("selecione um valor para o saque");
	quantia = scan.nextDouble();
	
    if(saldo>0 && saldo>=quantia ) {
    
    quantia = quantia-(quantia*0.005);
    System.out.println(quantia);
    saldo = saldo - quantia;
    }
    
    else { 
    	System.out.println("valor insuficiente para a realização do saque");
    }
    
}
public void obterSaldo() {
	System.out.println(saldo);
	
	
}
}
