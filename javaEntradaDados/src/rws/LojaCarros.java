package rws;

import javax.swing.JOptionPane;

public class LojaCarros {
	
	public static void main(String[] args) {
		
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros? ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas? ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		System.out.println("A divisão de pessoa deu: " + divisao + " carros " + resto);
		
	}

}
