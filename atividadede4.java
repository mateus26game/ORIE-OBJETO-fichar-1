package atividadede4;
import java.util.Scanner;
public class atividadede4 {
	

	
	void numer () {
		
		int respota = 0;
		Scanner valor = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("escreva um nummero");
		System.out.println("=====================");
		int numero1 = valor.nextInt();
		
		System.out.println("====================");
		System.out.println("escreva outro numero");
		System.out.println("=====================");
		int numero2 = valor.nextInt();
		
		System.out.println("====================");
		System.out.println("escreva mas um numero");
		System.out.println("=====================");
		int numero3 = valor.nextInt();
		
		if (numero1 > numero2 && numero1>numero3){
		      respota = numero1;
		    }
		    if (numero2 > numero1 && numero2>numero3){
		      respota = numero2;
		    }
		    if (numero3 > numero2 && numero3>numero1){
		      respota = numero3;
		    }

		    System.out.println("=============================");
		    System.out.println( "O maior numero foi "+respota );
		    System.out.println("=============================");
		    
		
		    valor.close();
		
	}

}
