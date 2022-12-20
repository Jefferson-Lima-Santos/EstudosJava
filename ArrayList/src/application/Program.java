package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
	public static void main (String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Jose");
		list.add("Carlos");
		list.add("Marcos");
//As listas são ordenadas e caso você deseje realizar a adicão de um valor em determinado ponto, basta adicionar o nome e a posicão
		list.add(2,"Rafael");
		// Existem alguns comandos utilizados com frequencia como o list.size() para verificar o tamanho da lista
		
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------");
		
		// Ou o comando list.remove("Jose"); que a remove comparando o resultado na lista
		// o Remove também pode ser usado passando a posição da lista list.remove(1);
		// Para cada String x Pertencente a lista list faça:
		// Existe Ainda a opção de remover por predicado, removendo por exemplo, todos os dados que comecam com a letra x
		// Para usar essa função basta utilizar list.removeIf(x-> x.charAt(0) == 'M');
		list.remove(3);//removeu o carlos
		list.remove("Jose");//removeu o josé
		list.removeIf(x-> x.charAt(0) == 'M');//removeu o marcos e a maria
		for (String x : list) {
			System.out.println(x);
		}
	}
}
