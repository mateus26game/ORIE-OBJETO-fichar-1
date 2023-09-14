package atividadede3;
import java.util.Scanner;
public class atividadee3 {

	
	void trii() {
		 Scanner entradaa = new Scanner(System.in);

		    double nota3;
		    String respota = "";
		    
		    System.out.println("===============================");
		    System.out.println("escreva a sua nota1");
		    System.out.println("===============================");
		    double nota1 = entradaa.nextDouble();
		    System.out.println("===============================");
		    System.out.println("escreva a sua nota2");
		    System.out.println("===============================");
		    double  nota2 = entradaa.nextDouble();
		    nota3 = ((nota2+nota1)/2);

		    
		    if (nota3 >= 7){
		     respota = "Aprovado";
		    }
		    if(nota3 == 10){
		    respota = "Aprovado com Distinção";
		    }
		    if(nota3 < 7){
		     respota = "Reprovado"; 
		    }
		    
		    System.out.println("==============================================");
		    System.out.println("sua media foi "+ nota3+ " voce foi "+ respota );
		    System.out.println("==============================================");
		
		    entradaa.close();
		    
	}
}
