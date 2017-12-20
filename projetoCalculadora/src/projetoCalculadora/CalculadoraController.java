package projetoCalculadora;

import javax.swing.JOptionPane;

public class CalculadoraController implements ICalculadora_Model {
	
public static void main(String[] args) {
		
		String numA = JOptionPane.showInputDialog("Digite o primeiro número:");
		String numB = JOptionPane.showInputDialog("Digite o segundo número:");

		double a = Double.parseDouble(numA);
		double b = Double.parseDouble(numB);
		
		
		double soma = a + b;
		double sub = a - b;
		double mult = a * b;
		double div = a / b;
		
		JOptionPane.showMessageDialog(null,
			    "Soma: " + soma + "\n" +
				"Subtração: " + sub + "\n" +
				"Multiplicação: " + mult + "\n" +
				"Divisão: " + div);
        }
}

