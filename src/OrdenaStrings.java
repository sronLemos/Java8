import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("testeq1");
		palavras.add("teste2");
		palavras.add("teste323");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
//		Collections.sort(palavras, comparador); JAVA 7
		palavras.sort(comparador); // JAVA 8
		System.out.println(palavras);
	}

}

class ComparadorPorTamanho implements Comparator<String> {

	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		
		return 0;
	}
	
}