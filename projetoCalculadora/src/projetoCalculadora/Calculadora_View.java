package projetoCalculadora;

import javax.swing.*;

public class Calculadora_View {
	
	
	
	@SuppressWarnings("unused")
	private static CalculadoraController c;
	private static String numA;
	private static String numB;

	public static void main(String[] args) {
		
		JOptionPane.showInputDialog("Digite o primeiro número:");
		JOptionPane.showInputDialog("Digite o segundo número:");
		
	}
	public static CalculadoraController getC(CalculadoraController c) {
		return c;
	}

	public static void setC(CalculadoraController c) {
		Calculadora_View.c = c;
	}
	public static String getNumB() {
		return numB;
	}
	public static void setNumB(String numB) {
		Calculadora_View.numB = numB;
	}
	public static String getNumA() {
		return numA;
	}
	public static void setNumA(String numA) {
		Calculadora_View.numA = numA;
	}
}