package sistemaenergia;

public class Cliente extends Endereco {
	
	private int Clienteid;
	private String nome;
	private Endereco endere�o;
	
	
	public int getClienteid() {
		return Clienteid;
	}
	public void setClienteid(int clienteid) {
		Clienteid = clienteid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getendere�o() {
		return endere�o;
	}
	public void setEndere�o(Endereco endere�o) {
		this.endere�o = endere�o;
	}
	

}
