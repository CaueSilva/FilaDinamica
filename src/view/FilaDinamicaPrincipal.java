package view;

import controller.FilaDinamicaMetodos;

import javax.swing.JOptionPane;

public class FilaDinamicaPrincipal {

	public static void main(String args[]) {

		FilaDinamicaMetodos fila = new FilaDinamicaMetodos();
		int opc = 0, element = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog(" 1 - Adiciona " + "\n 2 - Remove " + "\n 3 - Percorre " + "\n 9 - Fim"));
			switch (opc) {
			case 1:
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				fila.adiciona(element);
				break;
			case 2:
				System.out.println(fila.remove());
				break;
			case 3:
				System.out.println(fila.toString());
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
			}
		}

	}
}
