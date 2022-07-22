
public class Jogador {

		
	String nome;
	String apelido;
    int anoNascimento;
	int numero;
	String posicao;
	int qualidade;
	int cartoesAmarelos;
	boolean cartaoVermelho;
	
		public Jogador(String nome, int anoNascimento, int numero, String posicao){
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.numero = numero;
		this.posicao = posicao;
	}
	
	public boolean CondicaoDeJogo() {
		if(cartoesAmarelos >=3 || cartaoVermelho) {
			return false;			
		}else{			
		return true;
		}
	}
		
	public void aplicarCartao(int quantidade){
			cartoesAmarelos = cartoesAmarelos + quantidade;	
		}		
	
	public void cumprirSuspencao() {
		cartoesAmarelos = 0;
		cartaoVermelho = false;
		
		}
		
	public void treinar(int nivel) {	
		int qualidadePosTreino = qualidade + nivel;
		
		if(qualidadePosTreino > 100) {
			qualidade = 100;
		}else {
			qualidade = qualidadePosTreino;
	}
	

	        {
					
			}
				
	}
}
	


	
		
	


