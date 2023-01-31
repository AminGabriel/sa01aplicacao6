package br.com.javatagua.sa1.app6;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.CalcularBO;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2;
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo Empresarial");
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Preço do avião: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário: "));
		
		
		CalcularBO cbo = new CalcularBO();
		 
		JOptionPane.showMessageDialog(null, "Valor total da frota de aviões: " + cbo.multiplicar(valor1, valor2));

	}

}   
