package br.com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		//Data atual
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//Data inserida na "mao"
		LocalDate olimpiadas = LocalDate.of(2020, Month.JUNE, 5);
		
		//Diferença feita na "mao"
		int anos = olimpiadas.getYear() - hoje.getYear();
		System.out.println(anos);
		
		//Periodo entre datas
		Period periodo = Period.between(hoje, olimpiadas);
		System.out.println(periodo.getYears());
		
		//Somar
		System.out.println(olimpiadas.plusYears(4));
		
		//Formatar data
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatador.format(olimpiadas));
		
		
		//Formatar datas com horas
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		//Trabalhar somente com horas
		LocalTime intervalo = LocalTime.of(10, 30);
		System.out.println(intervalo);
		
	}
}
