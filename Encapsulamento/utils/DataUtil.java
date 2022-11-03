package utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataUtil {

	public static LocalDateTime stringToData( String dataString ) throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "dd/MM/yyy" );

		LocalDate dataConvertida = null;

		try {
			dataConvertida = LocalDate.parse( dataString, formatter );
		} catch ( DateTimeException de ) {
			throw new Exception( "A data não segue o formato desejado!" );
		}

		return dataConvertida.atStartOfDay();
	}

}
