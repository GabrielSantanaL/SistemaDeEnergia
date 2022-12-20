package sistemaenergia;

public class Endereco {
	
	private String Rua;
	private int Numero;
	private String Cep;
	private String Cidade;
	private String Estado;
	public String getRua() {
		return Rua;
	
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getCep() {
		return Cep;
	}
	public void setCep(String cep) {
		this.Cep = cep;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	public String toString() {
		String texto = "";
		
		texto = "----------------------------"
				+"\n Rua: " + getRua()
				+"\n Rua: " + getNumero()
				+"\n CEP: " + getCep()
				+"\n Cidade: " + getCidade()
				+"\n Estado: " + getEstado();
		
		return texto;
				
	
	}
}
