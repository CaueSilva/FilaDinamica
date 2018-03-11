package controller;

import model.No;

public class FilaDinamicaMetodos {

	private No inicio;

	public FilaDinamicaMetodos() {
		inicio = null;
	}

	public void adiciona(int e) {
		No novo = new No(e);
		if (inicio == null) {
			inicio = novo;
		} else {
			No aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = novo;
		}
	}

	public int remove() {
		int r = 0;
		if (inicio == null) {
			System.out.println("Erro! Lista vazia.");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}

	public String toString() {
		String r = "";
		No aux = inicio;
		while (aux != null) {
			r = r + " " + aux.dado;
			aux = aux.prox;
		}
		return r;
	}

}
