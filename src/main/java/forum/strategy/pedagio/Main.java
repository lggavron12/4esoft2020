package forum.strategy.pedagio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Insira o Tipo do Veículo para saber a taxa de pedágio:");
			String tipo = sc.next();
			TipoTaxa taxa = TipoTaxa.valueOf(tipo);
			sc.close();
			Pedagio pedagio = taxa.informarTaxa();
			Double valor = pedagio.informarTaxa();
			System.out.print("Taxa: R$ " + valor + ", veículo: " + tipo);

		} catch (IllegalArgumentException exception) {
			System.out.print("tente caminhao,motocicleta,onibus,pequenoporte,utilitario,van");
		}

	}

}
