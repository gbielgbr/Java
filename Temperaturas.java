/* 3.Escreva um programa que, com base em uma temperatura em graus celsius, 
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
seguindo as fórmulas: 
F = C* 1.8 + 32; K = C + 273.15; Re = C* 0.8; Ra = C* 1.8 + 32 + 459.67

*/
import java.util.Scanner;
public class temperatura {
	
	double K;
	double Ra;
	double Re;
	double F;
	double C;
	
	public void exiba () {
		System.out.printf("O resultado da conversão de Celsius para Kelvin é : %.2f\n", K);
		System.out.printf("O resultado da conversão de Celsius para Rankine é: %2f\n", Ra);
		System.out.printf("O resultado da conversão de Celsius para Reamur é: %.2f\n", Re);
		System.out.printf("O resultado da conversão de Celsius para Fahreheint é %.2f\n", F);
	
	}

	public static void main (String[]args){     	

		Scanner sc = new Scanner(System.in);
		temperatura formula = new temperatura();
		 
		System.out.println("DIGITE O VALOR EM CELSIUS:");
		formula.C = sc.nextDouble();
		
		 formula.K = formula.C + 273.15;
		 formula.Ra = (formula.C*1.8) + 32 + 459.67;
		 formula.Re = formula.C*0.8;
		 formula.F = (formula.C*1.8) + 32;
		 
		 formula.exiba();
}
}
