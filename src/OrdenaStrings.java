import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("testeq1");
		palavras.add("teste2");
		palavras.add("teste323");
		palavras.add("teste4");

		Comparator<String> comparador = new ComparadorPorTamanho();
		// Collections.sort(palavras, comparador); JAVA 7
		palavras.sort(comparador); // JAVA 8
		System.out.println(palavras);

		for (String teste : palavras) {
			System.out.println(teste);
		}

		// Classe anonima
		// palavras.forEach(new Consumer<String>() {
		// @Override
		// public void accept(String s) {
		// System.out.println(s);
		// }
		// });

		// Java 8 - Lambda
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		palavras.forEach(s -> System.out.println(s));

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;

			return 0;
		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;

		return 0;
	}

}