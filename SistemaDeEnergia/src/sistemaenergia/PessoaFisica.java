package sistemaenergia;

public class PessoaFisica  extends Cliente{
	
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
   public String toString() {
	String texto = "";
		
		texto = "----------------------------"
				+"\n CPF: " + getCPF();
				
		return texto;
				
	
	}
}
