package utils;

public class Validador {

	public static boolean isStringVazia( String texto ) {
		return texto == null || texto.isEmpty();
	}

	public static boolean isCpfValido( String cpf ) {
		return !isStringVazia( cpf ) && cpf.matches( "\\d*" ) && cpf.length() == 11;
	}

}
