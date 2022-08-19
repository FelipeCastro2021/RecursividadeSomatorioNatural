package View;

import Controller.RecursividadeSomatorio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursividadeSomatorio somatorio = new RecursividadeSomatorio();
		
		int numeroNatural = 4;
		
		int soma = somatorio.Somatorio(numeroNatural);
		System.out.println(soma);
	}

}
