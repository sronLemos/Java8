package br.com.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaStringsNewCompare {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("testeq1");
		palavras.add("teste2");
		palavras.add("teste323");
		palavras.add("teste4");
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);
	}

}
