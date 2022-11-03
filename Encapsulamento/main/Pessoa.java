package main;

import java.time.LocalDateTime;

import utils.DataUtil;
import utils.Validador;

public class Pessoa {

	private String nome;
	private String cpf;
	private LocalDateTime dataNascimento;

	public String descricaoPessoa() {
		return "O nome da pessoa é " + this.getNome() + " o cpf é " + getCpf() + " a data de nascimento é " + getDataNascimento();
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) throws Exception {
		if( Validador.isStringVazia( nome ) ) {
			throw new Exception( "O nome está vazio!" );
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		String primeiraParte = cpf.substring( 0, 3 );
		String segundaParte = cpf.substring( 3, 6 );
		String terceiraParte = cpf.substring( 6, 9 );
		String quartaParte = cpf.substring( 9, 11 );
		return primeiraParte + "." + segundaParte + "." + terceiraParte + "-" + quartaParte;
	}

	public void setCpf( String cpf ) throws Exception {
		if( !Validador.isCpfValido( cpf ) ) {
			throw new Exception( "O cpf é inválido" );
		} else {
			this.cpf = cpf;
		}
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento( String dataNascimento ) throws Exception {
		this.dataNascimento = DataUtil.stringToData( dataNascimento );
	}

}
