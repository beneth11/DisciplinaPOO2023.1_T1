package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int pre�ofab = 3500;
		int porcdistribuidor = 5;
		int percimpostos = 2;
		int valordistribuidor = pre�ofab * porcdistribuidor / 100;
		int valorimposto = pre�ofab * percimpostos / 100;
		int pre�ofinal = pre�ofab + valordistribuidor + valorimposto;
		
		System.out.println("O valor que o distribuidor ganha � de: " + valordistribuidor + "$");
		System.out.println("O valor de imposto pago � de: " + valorimposto + "$");
		System.out.println("O pre�o final � de: " + pre�ofinal + "$");
		
		
		

	}

}
