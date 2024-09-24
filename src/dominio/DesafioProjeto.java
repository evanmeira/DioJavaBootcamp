package dominio;

public class DesafioProjeto extends Conteudo {

	private int numeroQuestoes;	

	@Override
	public double calcularXp() {
		return XP_PADRAO * numeroQuestoes / 2;
	}
	
	public void setNumeroQuestoes(int numeroQuestoes) {
		this.numeroQuestoes = numeroQuestoes;
	}

}
