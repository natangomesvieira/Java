package main;

import java.util.Scanner;

import model.ICalculadora;
import model.Valores;
import utils.CalculadoraFactory;

public class Main {

	public static void main( String[] args ) {

		// verifica se irá realizar outra operação
		boolean verifica = true;

		do {

			Scanner scan = new Scanner( System.in );

			String operador = operacoes( scan ); // operacoes retorna o simbolo da operação matematica em String

			System.out.println( "Informe o primeiro valor:" );
			Float a = scan.nextFloat();
			System.out.println( "Informe o segundo valor:" );
			Float b = scan.nextFloat();

			ICalculadora opObtido = CalculadoraFactory.obterOperador( operador ); // passa o operador obtido anteriormente e obtem um enum especifico

			Valores valores = new Valores( a, b, opObtido ); // instancia a classe com os valores e um enum selecionado

			System.out.println( "Resultado = " + valores.calcular( a, b ) ); // chama o metodo calcular

			System.out.println( "Deseja realizar outra operação? (Sim/Não)" );
			verifica = "Sim".equalsIgnoreCase( scan.next() ) ? true : false; // realiza a verificação se é true ou false

		} while( verifica );

		System.out.println( "Operação cancelada com sucesso!" );
	}

	private static String operacoes( Scanner scan ) {
		System.out.println( "CALCULADORA" );
		System.out.println( "Escolha uma operação:" );

		System.out.println( "Somar: +" );
		System.out.println( "Subtrair: -" );
		System.out.println( "Multiplicar: *:" );
		System.out.println( "Dividir: /" );
		System.out.println( "Divisão-Módulo: %" );
		System.out.println( "Maior valor: >" );
		System.out.println( "Menor valor: <" );
		System.out.println( "Potencia: ^" );

		String operador = scan.nextLine();

		return operador;
	}

}
