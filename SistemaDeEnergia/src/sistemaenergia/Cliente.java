package sistemaenergia;

public class Cliente extends Endereco {
	
	private int Clienteid;
	private String nome;
	private Endereco endereço;
	
	
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
	public Endereco getendereço() {
		return endereço;
	}
	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}
	

}
