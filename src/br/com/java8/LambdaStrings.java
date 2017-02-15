package br.com.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("testeq1");
		palavras.add("teste2");
		palavras.add("teste323");
		palavras.add("teste4");
		
		palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
		palavras.forEach(p -> System.out.println(p));

	}

}
