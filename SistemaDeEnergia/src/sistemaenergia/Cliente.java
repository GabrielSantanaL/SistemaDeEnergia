package sistemaenergia;

public class Cliente extends Endereco {
	
	private int Clienteid;
	private String nome;
	private Endereco enderešo;
	
	
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
	public Endereco getenderešo() {
		return enderešo;
	}
	public void setEnderešo(Endereco enderešo) {
		this.enderešo = enderešo;
	}
	

}
