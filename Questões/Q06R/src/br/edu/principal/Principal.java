package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int salario =  1500;
		System.out.println("O seu sal�rio normal � de: " + salario + " reais.");
		int gratificacao = salario * 5/100;
		System.out.println("A gratifica��o que voc� recebe � de: " + gratificacao + " reais.");
		int imposto = salario * 7/100;
		System.out.println("O quanto de imposto que voc� paga � de: " + imposto + " reais.");
		int salariofinal = salario + gratificacao - imposto;
		System.out.println("O seu sal�rio l�quido � de: " + salariofinal + " reais.");
		

	}

}
