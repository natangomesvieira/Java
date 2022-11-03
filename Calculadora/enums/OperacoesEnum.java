package enums;

public enum OperacoesEnum {

	SOMAR( "+" ), SUBTRAIR( "-" ), MULTIPLICAR( "*" ), DIVIDIR( "/" ), MODULO( "%" ), MAIOR_VALOR( ">" ), MENOR_VALOR( "<" ), POTENCIA( "^" );

	private String operador;

	private OperacoesEnum( String operador ) {
		this.operador = operador;
	}

	public static OperacoesEnum parse( String simboloOperador ) {

		for( OperacoesEnum op : OperacoesEnum.values() ) {
			if( simboloOperador.equalsIgnoreCase( op.operador ) ) {
				return op;
			}

		}
		return null;
	}

}
