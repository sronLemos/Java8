package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

}

public class ExemploStream {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		// cursos.forEach(c -> System.out.println(c.getNome()));

		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(c -> System.out.println(c.getNome()));

		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(c -> c.getNome());
//			.forEach(total -> System.out.println(total));
		
		
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 1000)
			.findAny();
		
		//Não vai gerar nullpointer
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		//Retorna uma lista a partir de uma stream e apos ter feito um filtro
		List<Curso> lista = cursos.stream().filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());
		System.out.println(lista);
		
		//Retorna um mapa
		cursos.stream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c->c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos));
	}
}
