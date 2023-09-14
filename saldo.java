package atividadede2;
import java.util.Scanner;
public class saldo {

	
	
	
	
	
	   public void menu() {
           Scanner valor = new Scanner(System.in);

           int entrada;
           double deposito, saque, saque1;
          double saldo = 0.0;
      while (true) {
    	  System.out.println("======================");
          System.out.println("1) Depositar");
          System.out.println("2) Sacar");
          System.out.println("3) Ver Saldo");
          System.out.println("4) encerrar");
          System.out.println("======================");
           entrada = valor.nextInt();



      if (entrada == 1) {
    	  System.out.println("======================");
              System.out.println("Valor do deposito: ");
              System.out.println("======================");
              deposito = valor.nextDouble();
              saldo += deposito;
              System.out.println("======================");
              System.out.println(deposito + "Realizado com sucesso");
              System.out.println("======================");

    }else if (entrada == 2) {
    	System.out.println("======================");
             System.out.println("Valor do saque");
             System.out.println("======================");
             saque = valor.nextDouble();

                if (saque > saldo) {
                	System.out.println("=========================");
                         System.out.println("Saldo insuficiente.");
                         System.out.println("========================");
              } else {
                 saque1 = saque - saque * 0.005;
                 saldo -= saque1;
                 System.out.println("============================================");
                 System.out.println(" Saque de: " + saque1 + "Realizado com sucesso!");
                 System.out.println("============================================");
                  }

   }else if (entrada == 3) {
	   System.out.println("============================================");
                 System.out.println("Seu saldo é de: " + saldo);
                 System.out.println("============================================");

   }else if (entrada == 4) {
	   System.out.println("============================================");
                   System.out.println("Programa encerrado");
                   System.out.println("============================================");
                     break;
   }else{
	   System.out.println("============================================");
                   System.out.println("Resultado invalido");
                   System.out.println("============================================");
                   valor.close();
  }
 }
}
}
	

