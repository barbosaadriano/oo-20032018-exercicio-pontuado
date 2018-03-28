import java.util.Scanner;
public class JogoDaVelha {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			Partida p = new Partida();
			System.out.println("Partida configurada! pressione entre com 1 para jogar ou 0 para sair!");
			int decisao = scan.nextInt();
			if (decisao==0) {
				System.out.println("encerrando o jogo!");
				break;
			}
			p.play();
		}

	}

}