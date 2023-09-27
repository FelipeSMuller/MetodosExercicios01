package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class ExecutaCalculadora {

	public static void main(String[] args) {

		int numero1 = 0, numero2 = 0, opcao;

		do {

			try {

				numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));

				numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção :  \n1-Soma \n2-Subtração \n3-Divisão \n4-Multiplicação"));

				if (numero1 <= 0 || numero2 <= 0) {

					JOptionPane.showMessageDialog(null,
							"Não é impossível inserir números negativos ou iguais a 0 ( zero )  \nERRO!!");

					break;

				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você digitou dados inválidos ou fechou o programa incorretamente \nERRO!!");
				break;
			}

			switch (opcao) {

			case 1:

				JOptionPane.showMessageDialog(null, "Resultado final da SOMA = " + Calculadora.Soma(numero1, numero2));

				break;

			case 2:

				JOptionPane.showMessageDialog(null,
						"Resultado final da SUBTRAÇÃO = " + Calculadora.Subtracao(numero1, numero2));

				break;

			case 3:

				JOptionPane.showMessageDialog(null,
						"Resultado final da DIVISÃO = " + Calculadora.Divisao(numero1, numero2));

				break;

			case 4:

				JOptionPane.showMessageDialog(null,
						"Resultado final da MULTIPLICAÇÃO = " + Calculadora.Multiplicacao(numero1, numero2));

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Você não selecionou nenhuma operação matemática, FIM DA APLICAÇÃO!!!");

				break;
			}

		} while (numero1 > 0 && numero2 > 0);

	}

}
