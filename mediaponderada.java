/* 2.Crie uma classe chamada MediaPonderada que realiza o cálculo da média ponderada
de três notas. A classe deve solicitar ao usuário que insira as três notas e os 
pesos correspondentes, calcular a média ponderada e exibir Ο resultado. 
Seguindo a fórmula: média_ponderada 
= (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (neso1 + peso? + peso 3)



*/
import java.util.Scanner;
public class MediaPonderada {
	double num1;
	double num2;
	double num3;
	double peso, peso2, peso3;
	double resultado;
	
public void Ponderada(){
	System.out.printf("O resultado da média ponderada é : %.2f", resultado);
	}
	   

public static void main (String[]args){     	
	    
	 MediaPonderada multiplicacao = new MediaPonderada();
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Digite o numero 1: ");
     multiplicacao.num1 = sc.nextDouble();
     System.out.println("Digite o numero 2: ");
     multiplicacao.num2 = sc.nextDouble();
     System.out.println("Digite o numero 3: ");
     multiplicacao.num3 = sc.nextDouble();
    
     multiplicacao.peso = 1;
     multiplicacao.peso2 = 2;
     multiplicacao.peso3 = 3;
     
    
   multiplicacao.resultado = (multiplicacao.num1 * multiplicacao.peso + 
    multiplicacao.num2 * multiplicacao.peso2 +
    multiplicacao.num3 * multiplicacao.peso3) / (multiplicacao.peso + multiplicacao.peso2 + multiplicacao.peso3);
      
      multiplicacao.Ponderada();
	        
	    }
}
