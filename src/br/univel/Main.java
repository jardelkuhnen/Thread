package br.univel;

public class Main {

	public static void main(String[] args) {
		System.out.println("Init thread project");

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				Contador.getInstancia(10, true, "T1").contar();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				Contador.getInstancia(10, true, "T2").contar();

			}
		});

		t1.start();
		t2.start();

		System.out.println("Disparando a thread de contagem");

	}
}
