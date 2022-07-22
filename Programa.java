
public class Programa {

	public static void main(String[] args) {
		Jogador jog1 = new Jogador ("Cássio", 1988, 1, "goleiro");
		Jogador jog2 = new Jogador ("Lucio", 1990, 2, "zagueiro");
		Jogador jog3 = new Jogador ("Thiago", 1995, 5, "zagueiro");
		Jogador jog4 = new Jogador ("Cafú", 1985, 8, "lateral direito");
		Jogador jog5 = new Jogador ("Roberto", 2000, 15, "lateral esquerdo");
		Jogador jog6 = new Jogador ("Kaka", 1992, 7, "meio campo");
		Jogador jog7 = new Jogador ("Diego", 2002, 20, "meio campo");
		Jogador jog8 = new Jogador ("Plinio", 2000, 10, "atacante");
		Jogador jog9 = new Jogador ("Leo", 1997, 22, "atacante");
		Jogador jog10 = new Jogador ("JL", 2001, 18, "atacante");
		Jogador jog11 = new Jogador ("Antonio", 2020, 13, "volante");
		
	    Jogador [] jogadores = new Jogador [] {jog1, jog2, jog3, jog4, jog5, jog6, jog7, jog8, jog9, jog10, jog11};
	     
	     
	     
	     for(int i = 0; i < 11; i++) {
	     
	    
		System.out.println(jogadores[i].nome +", " + jogadores[i].anoNascimento +", " + jogadores[i].numero +", "+ jogadores[i].posicao);
	    jogadores[i].aplicarCartao(3);
	    System.out.println(jogadores[i].cartoesAmarelos + " cartões amarelos ");	       
	    System.out.println(jogadores[i].CondicaoDeJogo());
	    jogadores[i].cumprirSuspencao();
	    System.out.println(jogadores[i].CondicaoDeJogo());
	    jogadores[i].treinar(90);
	    System.out.println(jogadores[i].qualidade);
	    System.out.println("");
	     
			
	
		
		}
		
		

	}
}


