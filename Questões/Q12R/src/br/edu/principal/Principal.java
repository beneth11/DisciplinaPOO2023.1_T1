package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int num1 = 67;
		int num2 = 32;
		
		double E1 = Math.pow(num1, num2);
		double E2 = Math.pow(num2, num1);
		
		System.out.println("O resultado do primeiro n�mero elevado ao segundo � de: " + E1);
		System.out.println("O resultado do segundo n�mero elevado ao primeiro � de: " + E2);
		

	}

}
