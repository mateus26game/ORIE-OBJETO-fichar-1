package atividadede1;
import java.util.Scanner;
public class calculotriangu {
	
	void trianduloo() {
		  Scanner entrada = new Scanner(System.in);

	    System.out.println("===================================");
	    System.out.println("Escreva o lado A do triângulo:");
	    System.out.println("===================================");
	     double ladoA = entrada.nextDouble();
	    System.out.println("===================================");
	    System.out.println("Escreva o lado B do triângulo:");
	    System.out.println("===================================");
	    double ladoB = entrada.nextDouble();

	   double ladoC = ((Math.sqrt((ladoA * ladoA) + (ladoB * ladoB)))); 

	    System.out.println("===================================");
	    System.out.println("O quadrado da hipotenusa é: " + ladoC);
	    System.out.println("===================================");
		
		entrada.close();
	    
	}

}
