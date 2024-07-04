package ProjetoContador;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		while (true) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			int resultado = contagem(parametroUm, parametroDois);
			try {
				exibir(resultado);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static int contagem(int parametroUm, int parametroDois) {
		return parametroDois - parametroUm;
	}

	public static void exibir(int contar) throws Exception {
		if (contar < 0) {
			throw new Exception("O primeiro número deve ser menor que o segundo");
		} else
			for (int i = 1; i <= contar; i++) {
				System.out.println("Imprimindo o número " + i);
			}
	}
}
