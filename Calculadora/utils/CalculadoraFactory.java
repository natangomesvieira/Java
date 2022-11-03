package utils;

import enums.OperacoesEnum;
import model.Divisao;
import model.ICalculadora;
import model.MaiorValor;
import model.MenorValor;
import model.Modulo;
import model.Multiplicacao;
import model.Potencia;
import model.Soma;
import model.Subtracao;

public class CalculadoraFactory {

	public static ICalculadora obterOperador( String operador ) {

		if( operador == null || operador.isEmpty() ) {
			return null;
		}

		switch ( OperacoesEnum.parse( operador ) ) {
			case SOMAR:
				return new Soma();
			case SUBTRAIR:
				return new Subtracao();
			case MULTIPLICAR:
				return new Multiplicacao();
			case DIVIDIR:
				return new Divisao();
			case MODULO:
				return new Modulo();
			case MAIOR_VALOR:
				return new MaiorValor();
			case MENOR_VALOR:
				return new MenorValor();
			case POTENCIA:
				return new Potencia();
			default:
				return null;
		}
	}

}
