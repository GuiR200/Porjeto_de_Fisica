package fisica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;

	   try {
	//		System.out.println("Digite o numero da massa do peso");
	//		num1 = teclado.nextFloat();
		} catch (Exception ex) {
	//		teclado = new Scanner(System.in);
	//		num1 = 0;
		}

		try {
		//	System.out.println("Digite o numero da gravidade do peso");
		//	num2 = teclado.nextFloat();
		} catch (Exception ex) {
		//	num2 = 0;
		}
	//	Calculadora calc = new Calculadora();
	//	System.out.printf("A multiplicar é: %.2f", calc.multiplicar(num1, num2));
	//	teclado.close();
	
	            try {
			//		System.out.println("Digite o numero da forca do impolso");
			//		num1 = teclado.nextFloat();
				} catch (Exception ex) {
				//	teclado = new Scanner(System.in);
				//	num1 = 0;
				}

				try {
			//		System.out.println("Digite o numero da tempo do impulso");
			//		num2 = teclado.nextFloat();
				} catch (Exception ex) {
			//		num2 = 0;
				}
			//	Calculadora calc = new Calculadora();
			//	System.out.printf("A multiplicar é: %.2f", calc.multiplicar(num1, num2));
			//	teclado.close();
			
	            try {
					System.out.println("Digite o numero da forca do Forca Elástica");
					num1 = teclado.nextFloat();
				} catch (Exception ex) {
					teclado = new Scanner(System.in);
					num1 = 0;
				}

				try {
				    System.out.println("Digite o numero da equilibio do Forca Elástica");
					num2 = teclado.nextFloat();
				} catch (Exception ex) {
					num2 = 0;
				}
				Calculadora calc = new Calculadora();
				System.out.printf("A dividir é: %.2f", calc.dividir(num1, num2));
				teclado.close();
			}
}
