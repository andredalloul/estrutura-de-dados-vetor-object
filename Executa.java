package br.com.dalloul.vetor.objeto;

import br.com.dalloul.vetor.Vetor;

public class Executa {

	public static void main(String[] args) {

		VetorObjeto vetorObjeto = new VetorObjeto(5);

		vetorObjeto.adiciona(0);
		vetorObjeto.adiciona(1);
		vetorObjeto.adiciona("C");
		vetorObjeto.adiciona("D");
		vetorObjeto.adiciona(55);
		vetorObjeto.adiciona("F");

		System.out.print("Lista o Vetor -> ");
		System.out.println(vetorObjeto.lista());
		System.out.println();
		System.out.print("Tamanho do Vetor -> ");
		System.out.println(vetorObjeto.getTamanho());
		System.out.print("Obter o elemento de uma posi��o no Vetor -> ");
		System.out.println(vetorObjeto.buscaPosicao(4));
		System.out.println();
		System.out.print("Verifica se o elemento existe no Vetor -> ");
		System.out.println(vetorObjeto.buscaString(55));
		System.out.println();
		System.out.print("Adicionar elemento em qualquer posi��o do Vetor -> ");
		vetorObjeto.adiciona(2, "B+");
		System.out.println(vetorObjeto.lista());
		System.out.println();
		System.out.print("Remover o elemento do Vetor passando a posi��o -> ");
		System.out.println(vetorObjeto.remove(5));
		System.out.print(vetorObjeto.lista());

	}

}
