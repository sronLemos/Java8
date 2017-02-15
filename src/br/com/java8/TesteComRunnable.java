package br.com.java8;

public class TesteComRunnable {

	public static void main(String[] args) {
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();

		new Thread(() -> System.out.println("Execuntado um Runnable com lambda")).start();
	}

}
