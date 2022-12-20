package sistemaenergia;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		PessoaFisica pessoa = new PessoaFisica();
		Endereco endereco = new Endereco();
		System.out.println("Digite seu Nome:");
		String nome = teclado.next();
		pessoa.setNome(nome);
		teclado.nextLine();
		
		System.out.println("Digite sei ID:");
		int id = teclado.nextInt();
		pessoa.setClienteid(id);
		teclado.nextLine();
		
		System.out.println("Digite  seu CEP:");
		String Cep = teclado.next();
		pessoa.setCep(Cep);
		teclado.nextLine();
		
		System.out.println("Digite sua Cidade:");
		String cidade = teclado.next();
		pessoa.setCidade(cidade);
		teclado.nextLine();
		
		System.out.println("Digite seu CPF:");
		String cpf = teclado.next();
		pessoa.setCPF(cpf);
		teclado.nextLine();
		
		System.out.println("Digite seu Estado:");
		String estado = teclado.next();
		pessoa.setEstado(estado);
		teclado.nextLine();
		
		System.out.println("Digite o numero  de sua Casa:");
		int numero = teclado.nextInt();
		pessoa.setNumero(numero);
		teclado.nextLine();
		
		System.out.println("Digite o nome de sua Rua:");
		String rua = teclado.next();
		pessoa.setRua(rua);
		teclado.nextLine();
		//aaa
		System.out.println("-`´-`´-`´-`´-`´-`´-`´-`´-`´-`´-`´-`´-`´-`´-`´-`´-");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getClienteid());
		System.out.println(pessoa.getCPF());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getEstado());
		System.out.println(pessoa.getRua());
		
	}
}