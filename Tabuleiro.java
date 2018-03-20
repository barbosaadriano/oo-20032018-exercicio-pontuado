public class Tabuleiro {
	
	/**
	* um tabuleiro de jogo da velha contém nove quadrantes, você irá precisar deles aqui
	* este tabuleiro pode dois atributos abstrato, sendo jogador atual e numero de jogadas, apenas para controle, isso na realidade não acontece, mas aqui você precisará disso.
	**/

	public Tabuleiro() {
		// aqui você inicializa o que precisar inclusive os quadrantes
	}

	public void desenharTabuleiro() {
		// há, para ficar mais bunitinho, você pode desenhar o tabuleiro utilizando caracteres tipo |X|0|X|
	}
	public int getNJogada() {
		// este método você precisa retornar o número de jogada atual, para que a partida saiba quando está no fim
	}
	public void jogar(int quadrante) {
		//aqui você pega o tipo do jogador atual e seta no quadrante conforme o número informado, também incrementa o contador de jogada		
	}
	public Jogador getJogadorAtual() {
		// este método deve retornar quem é o jogador atual, pode ser útil quando alguém ganhar para você saber quem foi o ganhador
	}
	public void setJogadorAtual(Jogador jogadorAtual){
		// esté método irá definir quem é o jogador da vez
	}
	public boolean ganhou() {
		// este método precisa de bastante carinho e atenção
		// aqui deve fazer uma grande comparação das possíveis jogadas vencedoras e retornar verdadeiro se alguém ganhou
		//por padrão está retornando false.		
		return false;
	}


}