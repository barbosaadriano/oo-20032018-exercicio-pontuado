import java.util.Scanner;
import java.util.Random;
public class Partida {
	private Scanner scan;
	private Jogador jogador1;
	private Jogador jogador2;
	private int controleJogada;
	private Tabuleiro tabuleiro;

	public Partida() {
		scan = new Scanner(System.in);
		Random rnd = new Random();
		int tmp = rnd.nextInt(2);
		controleJogada = 2;
		if (tmp<2) {
			controleJogada = 1;
		}
		tabuleiro = new Tabuleiro();
		System.out.println("Entre com o nome do Joagador X :");
		String nome1 = scan.next();
		this.jogador1 = new Jogador(nome1,"X");
		System.out.println("Entre agora com o nome do Jogador O: ");
		String nome2 = scan.next();
		this.jogador2 = new Jogador(nome2,"O");
	}

	public void play() {
		tabuleiro.desenharTabuleiro();
		while (!tabuleiro.ganhou() && tabuleiro.getNJogada()<9) {
			if (controleJogada==1) {
				controleJogada=2;
				tabuleiro.setJogadorAtual(jogador1);
			} else if (controleJogada==2) {
				controleJogada=1;
				tabuleiro.setJogadorAtual(jogador2);
			}
			System.out.printf("%s é a sua vez! informe o número do quadrante que deseja marcar!\r\n",tabuleiro.getJogadorAtual().getNome());
			int num = scan.nextInt();
			tabuleiro.jogar(num);
			tabuleiro.desenharTabuleiro();
			if  (tabuleiro.ganhou()) {
				break;
			}
		}
		if (tabuleiro.ganhou()) {
			Jogador vencedor = tabuleiro.getJogadorAtual();
			System.out.printf("%s você ganhou!!",vencedor.getNome());
		} else {
			System.out.println("Ninguém ganhou!");
		}
	}

}