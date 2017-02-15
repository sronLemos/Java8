package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("testeq1");
		palavras.add("teste2");
		palavras.add("teste323");
		palavras.add("teste4");
		
		palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
		
		//Melhorias
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		System.out.println("Lambda");
		System.out.println(palavras);
		
		//Explicacao
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);

		
		/**************************************/
		//Method Reference
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println("Method Reference");
		System.out.println(palavras);
		
		
		//Explicacao
		Function<String, Integer> funcao2 = String::length;
		Comparator<String> comparador2 = Comparator.comparing(funcao2);
		palavras.sort(comparador2);
		
		palavras.forEach(p -> System.out.println(p));
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);

	}

}
