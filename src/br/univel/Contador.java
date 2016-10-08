package br.univel;

public class Contador {

	private final Integer contarAte;
	private final Boolean wait;
	private final String name;
	private static Contador instancia;

	public Contador(final Integer contarAte, final Boolean wait,
			final String name) {
		this.contarAte = contarAte;
		this.wait = wait;
		this.name = name;
	}

	public static Contador getInstancia(final Integer contarAte,
			final Boolean wait, final String name) {
		if (instancia == null) {
			instancia = new Contador(contarAte, wait, name);
		}
		return instancia;
	}

	public void contar() {

		Thread thread = Thread.currentThread();
		thread.setName(this.name);

		Integer contador = 0;

		while (contador < contarAte) {
			try {
				thread.sleep(1000);
				System.out.println("Contador " + contador + " Thread: "
						+ thread.getName());
				contador++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
