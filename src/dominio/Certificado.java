package dominio;

public class Certificado {
	
	private ConteudoComCargaHoraria conteudo;
	private Dev dev;
	
	public Certificado(ConteudoComCargaHoraria conteudo, Dev dev) {
		this.conteudo = conteudo;
		this.dev = dev;
	}

	public ConteudoComCargaHoraria getConteudo() {
		return conteudo;
	}

	public Dev getDev() {
		return dev;
	}

	@Override
	public String toString() {
		return "Certificado [conteudo=" + conteudo + ", dev=" + dev + "]";
	}
	
	

}
