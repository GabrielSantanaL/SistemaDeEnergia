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
	                +"\n Rua: " + getRua()
	                +"\n Rua: " + getNumero()
	                +"\n CEP: " + getCep()
	                +"\n Cidade: " + getCidade()
	                +"\n Estado: " + getEstado();
	        
	        return texto;
	                
	    
	    }
	}
