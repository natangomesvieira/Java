package main;

import java.util.Scanner;

public class Principal {

	public static void main( String args[] ) throws Exception {

		Scanner scan = new Scanner( System.in );

		System.out.println( "Digite o nome:" );
		String nome = scan.nextLine();

		System.out.println( "Digite o cpf:" );
		String cpf = scan.nextLine();

		System.out.println( "Digite a data do nascimento: (dia/mes/ano)" );
		String dataNascimento = scan.nextLine();

		Pessoa pessoa = new Pessoa();

		pessoa.setNome( nome );
		pessoa.setCpf( cpf );
		pessoa.setDataNascimento( dataNascimento );

		System.out.println( pessoa.descricaoPessoa() );

		scan.close();
	}

}
