package atividade1;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Cateto x = new Cateto();
        System.out.println("Dê um valor para os catetos A e B");
  x.ca = scan.nextDouble();
  x.cb = scan.nextDouble();
  x.hipo();   
		
		
	}

}
